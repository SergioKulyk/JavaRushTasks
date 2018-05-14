package com.javarush.task.task30.task3008;

import com.javarush.task.task30.task3008.client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException  {
        int port = ConsoleHelper.readInt();
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = null;
        System.out.println("Сервер запущен.");

        try {
            while (true) {
                socket = serverSocket.accept();
                new Handler(socket).start();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            socket.close();
            serverSocket.close();
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String userName = null;
            System.out.println("Установлено новое соединение с удаленным адресом: " + socket.getRemoteSocketAddress());
            try {
                Connection connection = new Connection(socket);
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Произошла ошибка при обмене данными с удаленным адресом.");
            }
            finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (userName != null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }
            System.out.println("Cоединение с удаленным адресом закрыто.");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String userName;

            do {
                Message userMessage;
                do {
                    connection.send( new Message(MessageType.NAME_REQUEST));
                    userMessage = connection.receive();
                    userName = userMessage.getData();
                } while (userMessage.getType() != MessageType.USER_NAME || userName.matches(" *"));
            } while (checkUserConnection(userName));

            connectionMap.put(userName, connection);
            connection.send(new Message(MessageType.NAME_ACCEPTED));
            return userName;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for(String name : connectionMap.keySet()) {
                if (!userName.equals(name))
                    connection.send(new Message(MessageType.USER_ADDED, name));
            }
        }


        /**
         * send messages to all users
         * @param connection
         * @param userName
         * @throws IOException
         * @throws ClassNotFoundException
         */
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT)
                    sendBroadcastMessage(new Message(message.getType(), userName + ": " +message.getData()));
                else
                    System.out.println("Ошибка получение сообщения...");
            }
        }
    }

    /**
     * sent message all persons
     * @param message
     */

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> iteration : connectionMap.entrySet()) {
            try {
                iteration.getValue().send(message);
            } catch (IOException e) {
                System.out.println("Сообщение не отправилось: " + iteration.getKey());
            }
        }
    }

    /**
     * is user Connection
     * @param userName
     * @return
     */
    private static boolean checkUserConnection(String userName) {
        for (String name : connectionMap.keySet())
            if (userName.equals(name))
                return true;

        return false;
    }


}

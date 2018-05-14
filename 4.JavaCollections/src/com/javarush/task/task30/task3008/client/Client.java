package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;
import java.text.ParseException;

public class Client {

    protected Connection connection;
    private volatile boolean clientConnected = false;

    public void run() {
        SocketThread socket = getSocketThread();
        socket.setDaemon(true);
        socket.start();

        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Ошибка нотификации.");
                return;
            }
        }

        if (isClientConnected()) {
            System.out.println("Соединение установлено. Для выхода наберите команду \'exit\'.");
        }
        else {
            System.out.println("Произошла ошибка во время работы клиента.");
        }

        String message;
        while (this.clientConnected) {
            message = ConsoleHelper.readString();
            try {
                if (message.equals("exit"))
                    break;
            } catch (NullPointerException e) {
                continue;
            }

            if (shouldSendTextFromConsole())
                sendTextMessage(message);
        }
    }

    protected String getServerAddress() {
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String message) {
        try {
            connection.send(new Message(MessageType.TEXT, message));
        } catch (IOException e) {
            e.printStackTrace();
            clientConnected = false;
        }
    }

    protected boolean isClientConnected() {
        return clientConnected;
    }


    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread {
        @Override
        public void run() {
            try {
                Socket socket = new Socket(getServerAddress(), getServerPort());
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                notifyConnectionStatusChanged(false);
            }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("Участник с именем %s присоединился к чату.", userName));
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("Участник с именем %s покинул чат.", userName));
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;

            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            Message message;
            while (true) {
                message = connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST)
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                else if (message.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    return;
                }
                else
                    throw new IOException("Unexpected MessageType");
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            Message message;
            MessageType messageType;
            String data;

            while (true) {
                message = connection.receive();
                messageType = message.getType();
                data = message.getData();

                if (messageType == MessageType.TEXT) {
                    processIncomingMessage(data);
                } else if (messageType == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(data);

                } else if (messageType == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(data);

                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }
    }
}

package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BotClient extends Client {

    public class BotSocketThread extends Client.SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message)  {
            ConsoleHelper.writeMessage(message);
            if (message.contains(": ")) {
                String[] messageSplit = message.split(": ");
                String format = formatData(messageSplit[1]);

                if (null != format) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                    sendTextMessage(String.format("Информация для %s: %s", messageSplit[0], simpleDateFormat.format(new Date())));
                }
            }
        }
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%d", (int) (Math.random() * 100));
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    private String formatData(String type) {
        Map<String, String> map = new HashMap<>();
        map.put("дата", "d.MM.YYYY");
        map.put("день", "d");
        map.put("месяц", "MMMM");
        map.put("год", "YYYY");
        map.put("время", "H:mm:ss");
        map.put("час", "H");
        map.put("минуты", "m");
        map.put("секунды", "s");

        for (Map.Entry<String, String> iterator : map.entrySet())
            if (type.equals(iterator.getKey()))
                return iterator.getValue();

        return null;
    }
}

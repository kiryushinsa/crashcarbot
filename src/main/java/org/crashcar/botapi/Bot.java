package org.crashcar.botapi;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends  {
    Logs logs= new Logs();





    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return logs.BOT_NAME; }

    @Override
    public String getBotToken() {
        return logs.TOKEN;
    }
}

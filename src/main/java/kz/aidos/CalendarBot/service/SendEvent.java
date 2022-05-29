package kz.aidos.CalendarBot.service;


import kz.aidos.CalendarBot.config.ApplicationContextProvider;
import kz.aidos.CalendarBot.dao.EventCashDAO;
import kz.aidos.CalendarBot.model.TelegramBot;
import lombok.Setter;
import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;


@Setter
//thread with event
public class SendEvent extends Thread {


    private long eventCashId;
    private SendMessage sendMessage;

    public SendEvent() {
    }

    @SneakyThrows
    @Override
    public void run() {
        TelegramBot telegramBot = ApplicationContextProvider.getApplicationContext().getBean(TelegramBot.class);
        EventCashDAO eventCashDAO = ApplicationContextProvider.getApplicationContext().getBean(EventCashDAO.class);
        telegramBot.execute(sendMessage);
        //if event it worked, need to remove it from the database of unresolved events
        eventCashDAO.delete(eventCashId);
    }
}
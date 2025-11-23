package ru.otus.java.basic.homeworks.homework5.notifications_system;

public class SmsSender extends NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[SMS] Sending sms: " + message);
    }
}

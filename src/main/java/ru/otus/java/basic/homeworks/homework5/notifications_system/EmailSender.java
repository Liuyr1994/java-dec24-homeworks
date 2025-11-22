package ru.otus.java.basic.homeworks.homework5.notifications_system;

public class EmailSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] email to user: " + message);
    }
}

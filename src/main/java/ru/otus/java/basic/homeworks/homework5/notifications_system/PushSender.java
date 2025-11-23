package ru.otus.java.basic.homeworks.homework5.notifications_system;

public class PushSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] notifications: " + message);
    }
}

package ru.otus.java.basic.homeworks.homework5.notifications_system;

public abstract class NotificationSender {
    public abstract void send(String message);

    public static void notifyAll(NotificationSender[] senders, String message) {
        for (int i = 0; i < senders.length; i++) {
            senders[i].send(message);
        }
    }
}

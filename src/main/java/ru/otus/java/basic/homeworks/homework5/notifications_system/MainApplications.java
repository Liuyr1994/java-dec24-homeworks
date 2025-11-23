package ru.otus.java.basic.homeworks.homework5.notifications_system;

public class MainApplications {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender pushSender = new PushSender();
        NotificationSender smsSender = new PushSender();
        NotificationSender[] notificationSenders = new NotificationSender[3];
        notificationSenders[0] = emailSender;
        notificationSenders[1] = pushSender;
        notificationSenders[2] = smsSender;
        NotificationSender.notifyAll(notificationSenders, "Hello World");
    }
}

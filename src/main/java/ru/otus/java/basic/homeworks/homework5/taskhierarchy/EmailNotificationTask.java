package ru.otus.java.basic.homeworks.homework5.taskhierarchy;

public class EmailNotificationTask extends Task {
    public EmailNotificationTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println("Sending 5 new notifications: " + title);
    }
}

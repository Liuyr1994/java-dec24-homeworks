package ru.otus.java.basic.homeworks.homework5.taskhierarchy;

public class DatabaseBackupTask extends Task {


    public DatabaseBackupTask(String title) {
        super(title);
    }

    @Override
    public void execute() {
        System.out.println("Starting full database backup: " + title);
    }
}

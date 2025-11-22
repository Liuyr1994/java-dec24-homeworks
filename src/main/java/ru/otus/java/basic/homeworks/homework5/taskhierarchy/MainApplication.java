package ru.otus.java.basic.homeworks.homework5.taskhierarchy;

public class MainApplication {
    public static void main(String[] args) {
        Task databaseBackupTask = new DatabaseBackupTask("DatabaseBackupTask");
        Task emailNotificationTask = new EmailNotificationTask("EmailNotificationTask");
        Task[] tasks = new Task[2];
        tasks[0] = databaseBackupTask;
        tasks[1] = emailNotificationTask;
        TaskManager taskManager = new TaskManager();
        taskManager.runTask(tasks);
    }
}

package ru.otus.java.basic.homeworks.homework5.taskhierarchy;

public class TaskManager {
    public void runTask(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            tasks[i].execute();
        }
    }
}

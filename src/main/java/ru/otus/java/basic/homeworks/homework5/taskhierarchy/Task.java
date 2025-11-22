package ru.otus.java.basic.homeworks.homework5.taskhierarchy;

public abstract class Task {
    String title;

    public Task(String title) {
        this.title = title;
    }

    public abstract void execute();
}

package ru.otus.java.basic.homeworks.homework6.gemini.audit_system;

public class LogEntry {
    private final String timestamp;
    private final String level;
    private final String message;

    public LogEntry(String timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }
}

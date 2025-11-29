package ru.otus.java.basic.homeworks.homework6.gemini.audit_system;

import java.util.Arrays;

public class AuditTrail {
    private final LogEntry[] entries;

    public AuditTrail(LogEntry[] entries) {
        this.entries = Arrays.copyOf(entries, entries.length);
    }

    public LogEntry[] getEntries() {
        return Arrays.copyOf(entries, entries.length);
    }
}

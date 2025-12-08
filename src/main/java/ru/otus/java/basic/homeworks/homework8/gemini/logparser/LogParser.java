package ru.otus.java.basic.homeworks.homework8.gemini.logparser;

public class LogParser {

    public static LogLevel parseLogLine(String line) throws LogFormatException {
        String[] lines = line.split(":");
        if (lines.length != 3) {
            throw new LogFormatException("Длина массива должна 3");
        }

        try {
            return LogLevel.valueOf(lines[1]);
        } catch (IllegalArgumentException e) {
            throw new LogFormatException("Неизвестный уровень лога");
        }
    }
}

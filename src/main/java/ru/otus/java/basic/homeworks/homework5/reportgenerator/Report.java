package ru.otus.java.basic.homeworks.homework5.reportgenerator;

import java.time.LocalDate;

public abstract class Report {
    LocalDate creationDate;

    public Report(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public abstract String generateContent();
}

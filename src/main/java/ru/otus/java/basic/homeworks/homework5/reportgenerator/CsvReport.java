package ru.otus.java.basic.homeworks.homework5.reportgenerator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CsvReport extends Report {

    public CsvReport(LocalDate creationDate) {
        super(creationDate);
    }

    @Override
    public String generateContent() {
        creationDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String result = creationDate.format(dateTimeFormatter);
        return result;
    }
}

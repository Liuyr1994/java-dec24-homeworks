package ru.otus.java.basic.homeworks.homework5.reportgenerator;

import java.time.LocalDate;

public class JsonReport extends Report {
    public JsonReport(LocalDate creationDate) {
        super(creationDate);
    }

    @Override
    public String generateContent() {
        String dateString = this.creationDate.toString();
        return "{\n" +
                "  \"reportType\": \"JSON\",\n" +
                "  \"date\": \"" + dateString + "\",\n" +
                "  \"status\": \"Generated successfully\"\n" +
                "}";
    }
}

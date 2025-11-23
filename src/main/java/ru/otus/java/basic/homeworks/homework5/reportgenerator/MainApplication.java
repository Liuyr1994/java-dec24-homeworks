package ru.otus.java.basic.homeworks.homework5.reportgenerator;

import java.time.LocalDate;

public class MainApplication {
    public static void main(String[] args) {
        Report reportCsv = new CsvReport(LocalDate.now());
        Report reportJson = new JsonReport(LocalDate.now());
        Report[] reports = new Report[2];
        reports[0] = reportCsv;
        reports[1] = reportJson;
        ReportProcessor reportProcessor = new ReportProcessor();
        for (int i = 0; i < reports.length; i++) {
            reportProcessor.processReport(reports[i]);
        }
    }
}

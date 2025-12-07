package ru.otus.java.basic.homeworks.homework7.gemini.geoparser;

import java.util.List;

public class ReportBuilder {
    public String buildReport(List<Parsable> data) {
        StringBuilder sb = new StringBuilder();

        sb.append("------------------------------------------------------------------------------------------------\n");
        sb.append("| СТАТУС  | ИСХОДНЫЕ ДАННЫЕ (ОБРЕЗАНО)       | РЕЗУЛЬТАТ ПАРСИНГА\n");
        sb.append("------------------------------------------------------------------------------------------------\n");

        for (Parsable item : data) {
            String parsedResult;
            String status;
            String rawData = item.getRawData();

            try {
                parsedResult = item.parse();

                if (parsedResult != null && parsedResult.trim().isEmpty()) {
                    status = "VALID";
                } else {
                    status = "INVALID";
                    parsedResult = "Ошибка: Неполные данные в исходной строке";
                }
            } catch (Exception e) {
                status = "ERROR";
                String errorMsg = e.getMessage() != null ? e.getMessage() : e.getClass().getSimpleName();
                parsedResult = "СБОЙ: " + (errorMsg.length() > 40 ? errorMsg.substring(0, 40) + "..." : errorMsg);
            }

            String truncatedRaw = rawData.length() > 30 ? rawData.substring(0, 27) + "..." : rawData;
            sb.append(String.format(
                    "| %-7s | %-30s | %s\n",
                    status,
                    truncatedRaw,
                    parsedResult
            ));
        }
        sb.append("------------------------------------------------------------------------------------------------\n");
        return sb.toString();
    }
}

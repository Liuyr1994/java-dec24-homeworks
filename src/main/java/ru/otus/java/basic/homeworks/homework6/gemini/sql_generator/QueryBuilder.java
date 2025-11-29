package ru.otus.java.basic.homeworks.homework6.gemini.sql_generator;

public class QueryBuilder {
    private String table;
    private String[] columns;

    public QueryBuilder(String table, String[] columns) {
        this.table = table;
        this.columns = columns;
    }

    public String buildSelectQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        if (columns == null || columns.length == 0) {
            sb.append("* FROM ").append(table).append(";");
            return sb.toString();
        }
        for (int i = 0; i < columns.length - 1; i++) {
            sb.append(columns[i]).append(", ");
        }
        sb.append(columns[columns.length - 1]);
        sb.append(" FROM ").append(table).append(";");
        return sb.toString();
    }
}

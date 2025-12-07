package ru.otus.java.basic.homeworks.homework7.gemini.geoparser;

public enum DataFormat {
    JSON_LIKE {
        @Override
        public String getDelimiter() {
            return ":";
        }
    }, CSV {
        @Override
        public String getDelimiter() {
            return ",";
        }
    };

    public abstract String getDelimiter();
}

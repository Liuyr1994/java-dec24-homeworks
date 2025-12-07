package ru.otus.java.basic.homeworks.homework7.gemini.geoparser;

public class GeoDataParser implements Parsable {
    private final String rawData;

    public GeoDataParser(String rawData) {
        this.rawData = rawData;
    }

    @Override
    public String parse() {
        if (rawData == null || rawData.trim().isEmpty()) {
            return null;
        }

        String[] pairs = rawData.split(";");
        String lat = "";
        String lon = "";
        String name = "";

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");

            if (keyValue.length < 2) continue;
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (key.equalsIgnoreCase("lat")) {
                lat = value;
            } else if (key.equalsIgnoreCase("lon")) {
                lon = value;
            } else if (key.equalsIgnoreCase("name")) {
                name = value;
            }
        }

        return String.format("Location: %s (Lat: %s, Lon: %s)", name, lat, lon);
    }

    @Override
    public String getRawData() {
        return rawData;
    }
}

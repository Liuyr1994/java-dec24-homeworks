package ru.otus.java.basic.homeworks.homework7.gemini.networkprotocols;

public class NetworkConfig {
    public static String getConnectionString(ProtocolType type, String host) {
        return String.format("Протокол: %s. Хост: %s:%d. Таймаут: %d мс.", type.name(), host, type.getDefaultPort(), type.getMaxTimeoutMs());
    }

    public static boolean isSecure(ProtocolType type) {
        return type == ProtocolType.HTTPS;
    }
}

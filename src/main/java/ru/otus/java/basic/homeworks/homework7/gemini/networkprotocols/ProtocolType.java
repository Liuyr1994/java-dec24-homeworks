package ru.otus.java.basic.homeworks.homework7.gemini.networkprotocols;

public enum ProtocolType {
    HTTP(1, 1), HTTPS(2, 1), FTP(3, 1);
    private final int defaultPort;
    private final int maxTimeoutMs;

    ProtocolType(int defaultPort, int maxTimeoutMs) {
        this.defaultPort = defaultPort;
        this.maxTimeoutMs = maxTimeoutMs;
    }

    public int getDefaultPort() {
        return defaultPort;
    }

    public int getMaxTimeoutMs() {
        return maxTimeoutMs;
    }
}

package ru.otus.java.basic.homeworks.homework5.server_configuration;

public class ServerConfiguration {
    private final String host;
    private final int port;

    protected ServerConfiguration(String host, int port) {
        this.host = host;
        this.port = port;
    }
}

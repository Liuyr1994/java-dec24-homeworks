package ru.otus.java.basic.homeworks.homework5.server_configuration;

public class ConfigFactory {
    public static ServerConfiguration createDefault(String host, int port) {
        if (host != null && port >= 1024 && port <= 65534) {
            return new ServerConfiguration(host, port);
        }
        throw new IllegalArgumentException("Неккоректные данные");
    }
}

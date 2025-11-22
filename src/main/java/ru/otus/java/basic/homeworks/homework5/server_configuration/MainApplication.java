package ru.otus.java.basic.homeworks.homework5.server_configuration;

public class MainApplication {
    public static void main(String[] args) {
        ServerConfiguration serverConfiguration = ConfigFactory.createDefault("asd", 2222);
    }
}

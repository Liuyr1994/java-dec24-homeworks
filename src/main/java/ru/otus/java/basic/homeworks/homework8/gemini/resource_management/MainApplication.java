package ru.otus.java.basic.homeworks.homework8.gemini.resource_management;

public class MainApplication {
    public static void main(String[] args) {
        try (ConnectionManager connectionManager = new ConnectionManager()) {
            connectionManager.fetch("asdqwe");
        } catch (Exception e) {

        }
    }
}

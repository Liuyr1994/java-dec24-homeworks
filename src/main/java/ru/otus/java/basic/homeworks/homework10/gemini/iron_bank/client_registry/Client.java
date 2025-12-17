package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry;

import java.util.Objects;

public abstract class Client {
    private final String id;
    private String name;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract long getTransactionLimit();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

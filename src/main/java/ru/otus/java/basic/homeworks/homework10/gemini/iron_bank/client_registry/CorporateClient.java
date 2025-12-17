package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry;

public class CorporateClient extends Client {
    public CorporateClient(String id, String name) {
        super(id, name);
    }

    @Override
    public long getTransactionLimit() {
        return 1000000L;
    }
}

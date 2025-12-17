package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry;

public class IndividualClient extends Client {
    public IndividualClient(String id, String name) {
        super(id, name);
    }

    @Override
    public long getTransactionLimit() {
        return 50000L;
    }
}

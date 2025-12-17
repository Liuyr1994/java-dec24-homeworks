package ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.client_registry;

import ru.otus.java.basic.homeworks.homework10.gemini.iron_bank.my_exception.ClientExistsException;

import java.util.HashSet;
import java.util.Set;

public class ClientRegistry {
    private final Set<Client> clients = new HashSet<>();

    public void register(Client client) {
        if (!clients.add(client)) {
            throw new ClientExistsException("Такой клиент уже есть");
        }
    }

    public Client findClientById(String id) {
        for (Client client : clients) {
            if (client.getId().equalsIgnoreCase(id)) {
                return client;
            }
        }

        return null;
    }
}

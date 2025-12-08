package ru.otus.java.basic.homeworks.homework8.gemini.inventory.my_exception;

public class ItemNotFoundException extends InventoryException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}

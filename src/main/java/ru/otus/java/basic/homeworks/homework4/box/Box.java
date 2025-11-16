package ru.otus.java.basic.homeworks.homework4.box;

import java.util.Arrays;

public class Box {
    private int size;
    private String[] sized;
    private String color;
    private boolean open = false;

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        sized = new String[size];
    }

    public void isOpen() {
        open = true;
        System.out.println("Коробка открыта");
    }

    public void isClosed() {
        open = false;
        System.out.println("Коробка закрыта");
    }

    public void addItem(String item) {
        if (open == false) {
            System.out.println("Коробка закрыта, пожалуйста откройте её.");
        }
        for (int i = 0; i < sized.length; i++) {
            if (sized[i] == null) {
                sized[i] = item;
                System.out.println("В коробку успешно добавлен предмет: " + item);
                return;
            }
        }
        System.out.println("Не удалось добавить предмет в коробку т.к. коробка переполнена");
    }

    public void removeItem(String item) {
        if (open == false) {
            System.out.println("Коробка закрыта, пожалуйста откройте её.");
        }

        for (int i = 0; i < sized.length; i++) {
            if (sized[i].equalsIgnoreCase(item)) {
                sized[i] = null;
                System.out.println("Предмет успешно выкинут из коробки");
                return;
            }
        }

        System.out.println("Данного предмета нет в коробке");
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                ", sized=" + Arrays.toString(sized) +
                ", color='" + color + '\'' +
                ", open=" + open +
                '}';
    }
}

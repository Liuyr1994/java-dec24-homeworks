package ru.otus.java.basic.homeworks.homework5.rpg_combat;

public class Warrior extends Fighter {
    public Warrior(String name, int health, int stamina) {
        super(name, health, stamina);
    }

    @Override
    int attack() {
        if (stamina >= 10) {
            stamina -= 10;
            return 40;
        }
        return 0;
    }
}

package ru.otus.java.basic.homeworks.homework5.rpg_combat;

public class Archer extends Fighter {
    public Archer(String name, int health, int stamina) {
        super(name, health, stamina);
    }

    @Override
    int attack() {
        if (stamina >= 5) {
            stamina -= 5;
            return 25;
        }
        return 0;
    }
}

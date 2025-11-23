package ru.otus.java.basic.homeworks.homework5.rpg_combat;

public class Mage extends Fighter {
    public Mage(String name, int health, int stamina) {
        super(name, health, stamina);
    }

    @Override
    int attack() {
        if (stamina >= 15) {
            stamina -= 15;
            return 30;
        }
        stamina = 0;
        return 10;
    }
}

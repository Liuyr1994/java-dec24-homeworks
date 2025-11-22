package ru.otus.java.basic.homeworks.homework5.rpg_combat;

public class MainApplications {
    public static void main(String[] args) {
        Fighter archer = new Archer("Леголас", 100, 100);
        Fighter mage = new Mage("Кадгар", 100, 100);
        Fighter warrior = new Warrior("Громмаш", 100, 100);
        Fighter[] fighters = new Fighter[3];
        fighters[0] = archer;
        fighters[1] = mage;
        fighters[2] = warrior;
        for (int i = 0; i < fighters.length; i++) {
            Fighter.fight(fighters[i], fighters[fighters.length - i - 1]);
        }
    }
}

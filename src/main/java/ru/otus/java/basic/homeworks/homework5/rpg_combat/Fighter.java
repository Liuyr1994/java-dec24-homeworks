package ru.otus.java.basic.homeworks.homework5.rpg_combat;

public abstract class Fighter {
    String name;
    int health;
    int stamina;

    public Fighter(String name, int health, int stamina) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
    }

    abstract int attack();

    public void receiveDamage(int damage) {
        if (isAlive()) {
            health -= damage;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public static Fighter fight(Fighter f1, Fighter f2) {
        Fighter winner;
        while (f1.isAlive() && f1.isAlive()) {
            f1.receiveDamage(f2.attack());
            f2.receiveDamage(f1.attack());
        }
        winner = f1.health > f2.health ? f1 : f2;
        System.out.println("В бою участвовали: " + f1.toString() + " и " + f2.toString());
        System.out.println("Победил: " + winner.toString());
        return winner;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", stamina=" + stamina +
                '}';
    }
}

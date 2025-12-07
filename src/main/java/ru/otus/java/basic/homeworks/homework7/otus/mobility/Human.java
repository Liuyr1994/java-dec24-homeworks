package ru.otus.java.basic.homeworks.homework7.otus.mobility;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int energy = 100;


    public Human(String name, int fuel) {
        this.name = name;
    }


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void mount(Transport transport) { // Принимаем абстракцию!
        this.currentTransport = transport;
    }

    public void dismount() {
        currentTransport = null;
    }

    public boolean move(Terrains terrains, int distance) {
        if (currentTransport == null && distance < energy) {
            System.out.println("Человек пошел пешком: " + distance);
            energy -= distance;
            return true;
        }

        Transport transport = currentTransport;
        return currentTransport.move(terrains, distance);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", currentTransport=" + currentTransport +
                ", energy=" + energy +
                '}';
    }
}

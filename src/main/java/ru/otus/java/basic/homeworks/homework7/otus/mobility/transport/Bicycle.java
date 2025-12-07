package ru.otus.java.basic.homeworks.homework7.otus.mobility.transport;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.Human;
import ru.otus.java.basic.homeworks.homework7.otus.mobility.Transport;
import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public class Bicycle implements Transport {
    private Human human;

    public Bicycle(Human human) {
        this.human = human;
    }

    @Override
    public boolean move(Terrains terrains, int distance) {
        if (terrains == Terrains.SWAMP) {
            System.out.println("Вы не можете перемещаться на велосепеде по болоту");
            return false;
        }

        if (human.getEnergy() < distance) {
            System.out.println("У вас недостаточно сил что бы перемезаться на данную дистанцию на велесепеде");
            return false;
        }

        System.out.println("Вы удачно проехали нужную дистанцию");
        human.setEnergy(human.getEnergy() - distance);
        return true;
    }

    @Override
    public String getResourceName() {
        return human.getEnergy() + " силы человека";
    }
}

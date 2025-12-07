package ru.otus.java.basic.homeworks.homework7.otus.mobility.transport;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.Transport;
import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public class ATV implements Transport {
    private int fuel;

    public ATV(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrains terrains, int distance) {
        if (fuel < distance) {
            System.out.println("Вездеход не смог проехать указанную дистанцию не хватает бензина((");
            return false;
        }
        System.out.println("Вездеход смог преодолеть указанную дистанцию");
        fuel -= distance;
        return true;
    }

    @Override
    public String getResourceName() {
        return fuel + " топливо вездехода";
    }
}

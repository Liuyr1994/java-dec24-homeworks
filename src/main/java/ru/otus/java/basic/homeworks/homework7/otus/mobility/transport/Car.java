package ru.otus.java.basic.homeworks.homework7.otus.mobility.transport;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.Transport;
import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrains terrains, int distance) {
        if (terrains == Terrains.DENSE_FOREST || terrains == Terrains.SWAMP) {
            System.out.println("Вы не можете перемещаться на машине по болоту и густому лесу");
            return false;
        }

        if (distance > fuel) {
            System.out.println("Вы не можете проехать данное расстояние у вас недостаточно бензина((");
        }

        System.out.println("Вы проехали на машине указанную дистанцию");
        fuel -= distance;
        return true;
    }

    @Override
    public String getResourceName() {
        return fuel + " топливо автомабиля";
    }
}

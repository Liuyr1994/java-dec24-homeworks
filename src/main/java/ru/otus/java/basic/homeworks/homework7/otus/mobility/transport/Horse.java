package ru.otus.java.basic.homeworks.homework7.otus.mobility.transport;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.Transport;
import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public class Horse implements Transport {
    private int strength;

    public Horse(int strength) {
        this.strength = strength;
    }

    @Override
    public boolean move(Terrains terrains, int distance) {
        if (terrains == Terrains.SWAMP) {
            System.out.println("Вы не можете перемещаться на коне по болоту");
            return false;
        }

        if (strength < distance) {
            System.out.println("У вашего коня недостаточно сил что бы перемещаться на данную дистанцию");
            return false;
        }

        strength -= distance;
        System.out.println("Вы удачно проехали нужную дистанцию на коне");
        return true;
    }

    @Override
    public String getResourceName() {
        return strength + " силы лошади";
    }
}

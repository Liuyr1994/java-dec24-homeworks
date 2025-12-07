package ru.otus.java.basic.homeworks.homework7.otus.mobility;

import ru.otus.java.basic.homeworks.homework7.otus.mobility.terrain.Terrains;

public interface Transport {
    boolean move(Terrains terrains, int distance);

    String getResourceName();
}

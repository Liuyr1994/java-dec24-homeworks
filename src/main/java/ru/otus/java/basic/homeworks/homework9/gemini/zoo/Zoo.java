package ru.otus.java.basic.homeworks.homework9.gemini.zoo;

import java.util.Iterator;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void performShow() {
        Iterator<Animal> it = animals.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            animal.voice();
        }
    }
}

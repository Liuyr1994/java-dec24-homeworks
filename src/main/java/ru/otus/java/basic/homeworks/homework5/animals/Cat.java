package ru.otus.java.basic.homeworks.homework5.animals;

public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Коты не умеют плавать");
        return -1;
    }
}

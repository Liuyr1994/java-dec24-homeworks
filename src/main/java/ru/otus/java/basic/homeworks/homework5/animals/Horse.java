package ru.otus.java.basic.homeworks.homework5.animals;

public class Horse extends Animal {
    public Horse(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public int swim(int distance) {
        int swimmingTime = 0;
        if (distance * 4 > stamina) {
            System.out.println(name + " не смог переплыть эту дистанцию.\nПоявилость состояние усталости.");
            return -1;
        }
        swimmingTime = distance / swimmingSpeed;
        System.out.println(name + " переплыл за: " + swimmingTime + "секунд");
        stamina -= distance * 4;
        return swimmingTime;
    }
}

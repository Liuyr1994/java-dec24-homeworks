package ru.otus.java.basic.homeworks.homework5.animals;

public class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
    }

    @Override
    public int swim(int distance) {
        int swimmingTime = 0;
        if (distance * 2 > stamina) {
            System.out.println(name + " не смог переплыть эту дистанцию.\nПоявилость состояние усталости.");
            return -1;
        }
        swimmingTime = distance / swimmingSpeed;
        System.out.println(name + " переплыл за: " + swimmingTime + "секунд");
        stamina -= distance * 2;
        return swimmingTime;
    }
}

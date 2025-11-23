package ru.otus.java.basic.homeworks.homework5.animals;

public abstract class Animal {
    String name;
    int runningSpeed;
    int swimmingSpeed;
    int stamina;

    public Animal(String name, int runningSpeed, int swimmingSpeed, int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        int runningTime = 0;
        if (distance > stamina) {
            System.out.println(name + " не смог пробежать данную дистанцию.\nПоявилось состояние усталости");
            return -1;
        }
        runningTime = distance / runningSpeed;
        System.out.println(name + " пробежал за: " + runningTime + "секунд");
        stamina -= distance;
        return runningTime;
    }

    public abstract int swim(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", runningSpeed=" + runningSpeed +
                ", swimmingSpeed=" + swimmingSpeed +
                ", stamina=" + stamina +
                '}';
    }
}

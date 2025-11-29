package ru.otus.java.basic.homeworks.homework6.otus.cat_food_manager;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHappy = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate) {
        isHappy = plate.tryEat(appetite);
        if (isHappy) {
            System.out.println(name + " поел.");
            return;
        }
        System.out.println(name + " не хватило еды");

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHappy() {
        return isHappy;
    }

    @Override
    public String toString() {
        String state = isHappy ? "Сыт" : "Голоден";
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isHappy=" + state +
                '}';
    }
}

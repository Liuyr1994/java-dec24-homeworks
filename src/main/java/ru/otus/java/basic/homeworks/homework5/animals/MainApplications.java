package ru.otus.java.basic.homeworks.homework5.animals;

public class MainApplications {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 10, 0, 100);
        Animal dog = new Dog("Bobik", 22, 15, 100);
        Animal horse = new Horse("Wind", 50, 4, 100);
        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = horse;
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].run(22));
            System.out.println(animals[i].swim(10));
            System.out.println(animals[i].toString());
        }
    }
}

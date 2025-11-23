package ru.otus.java.basic.homeworks.homework5.transport_hierarchy;

public abstract class Transport {
    String model;
    double maxSpeed;
    double weight;

    public Transport(String model, double maxSpeed, double weight) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    abstract double calculateFuelConsumption(double distance);

    public void info() {
        System.out.println("Модель: " + model + "\nМаксимальная скорость: " + maxSpeed + "\nВес: " + weight);
    }
}

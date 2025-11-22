package ru.otus.java.basic.homeworks.homework5.transport_hierarchy;

public class Motorcycle extends Transport {
    public Motorcycle(String model, double maxSpeed, double weight) {
        super(model, maxSpeed, weight);
    }

    @Override
    double calculateFuelConsumption(double distance) {
        return distance * 0.04;
    }
}

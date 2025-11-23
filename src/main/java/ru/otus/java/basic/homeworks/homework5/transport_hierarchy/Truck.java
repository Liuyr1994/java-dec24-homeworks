package ru.otus.java.basic.homeworks.homework5.transport_hierarchy;

public class Truck extends Transport {
    public Truck(String model, double maxSpeed, double weight) {
        super(model, maxSpeed, weight);
    }

    @Override
    double calculateFuelConsumption(double distance) {
        return distance * 0.25 + weight * 0.001;
    }
}

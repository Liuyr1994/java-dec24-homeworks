package ru.otus.java.basic.homeworks.homework5.transport_hierarchy;

public class MainApplications {
    public static void main(String[] args) {
        Transport car = new Car("BMW M5", 330, 1895);
        Transport motorcycle = new Motorcycle("Kawasaki Ninja H2R", 357, 216);
        Transport truck = new Truck("MAN TGX", 100, 8000);
        Transport[] transports = new Transport[3];
        transports[0] = car;
        transports[1] = motorcycle;
        transports[2] = truck;
        for (int i = 0; i < transports.length; i++) {
            transports[i].info();
            System.out.println("Расход топлива: " + transports[i].calculateFuelConsumption(100));
            System.out.println();
        }
    }
}

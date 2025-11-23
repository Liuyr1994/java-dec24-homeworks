package ru.otus.java.basic.homeworks.homework5.shapes;

public class Rectangle extends Shape {
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double area() {
        return weight * height;
    }
}

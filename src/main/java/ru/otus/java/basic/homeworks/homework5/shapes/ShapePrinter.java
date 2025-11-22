package ru.otus.java.basic.homeworks.homework5.shapes;

public class ShapePrinter {
    public static void printArea(Shape shape) {
        System.out.println("Фигура: " + shape.getClass().getSimpleName() + " имеет площадь : " + shape.area());
    }
}

package ru.otus.java.basic.homeworks.homework5.shapes;

public class MainApplication {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(22, 22);
        Shape circle = new Circle(22);
        Shape triangle = new Triangle(22, 22, 22);
        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = circle;
        shapes[2] = triangle;
        for (int i = 0; i < shapes.length; i++) {
            ShapePrinter.printArea(shapes[i]);
        }
    }
}

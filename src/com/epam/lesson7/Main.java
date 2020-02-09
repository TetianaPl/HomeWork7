package com.epam.lesson7;

public class Main {
    public static void ptintFigures(Shape[] object) {
        for (Shape elem : object) {
            System.out.println(elem + ", area = " + elem.calcArea());
        }
    }

    public static double calcAllAreas(Shape[] object) {
        double square = 0;
        for (Shape elem : object) {
            square += elem.calcArea();
        }
        return square;
    }

    public static double calcFiguresAreas(Shape[] object, String name) {
        double square = 0;
        for (Shape elem : object) {
            if (elem.getClass().getSimpleName().equals(name)) {
                square += elem.calcArea();
            }
        }
        return square;
    }

    public static void main(String[] args) {
        Shape[] figures = {
                new Rectangle("red", 12, 14),
                new Rectangle("yellow", 1, 4),
                new Rectangle("blue", 12.5, 10),
                new Rectangle("black", 0.3, 0.7),
                new Circle("green", 15.9),
                new Circle("white", 17.0),
                new Circle("yellow", 0.1),
                new Triangle("orange", 13, 5, 10),
                new Triangle("green", 13, 16, 17)
        };

        ptintFigures(figures);
        System.out.println("Total area = " + calcAllAreas(figures));
        System.out.println("Total area of rectangles = " + calcFiguresAreas(figures, "Rectangle"));
        System.out.println("Total area of circles = " + calcFiguresAreas(figures, "Circle"));
        System.out.println("Total area of triangles = " + calcFiguresAreas(figures, "Triangle"));
    }
}

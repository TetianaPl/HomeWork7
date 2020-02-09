package com.epam.lesson7;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        if (!(a + b > c && a + c > b && b + c > a)) {
            System.err.println("Triangle with sides " + a + ", " + b + ", " + c + " does no exist");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", side a = " + a + ", side b = " + b + ", side c = " + c;
    }

    @Override
    public double calcArea() {
        if (!(a + b > c && a + c > b && b + c > a)) {
            return super.calcArea();
        }
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}

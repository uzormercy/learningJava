package SOLID.ocp;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
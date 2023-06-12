package DesignPatterns.Factory;

public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // Creating a circle
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        // Creating a square
        Shape square = shapeFactory.createShape("square");
        square.draw();

        // Creating a triangle
        Shape triangle = shapeFactory.createShape("triangle");
        triangle.draw();
    }
}

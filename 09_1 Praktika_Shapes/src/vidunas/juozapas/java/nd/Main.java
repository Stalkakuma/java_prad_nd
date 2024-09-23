package vidunas.juozapas.java.nd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Square square = new Square(5, "green", false);
        Rectangle rect = new Rectangle("yellow", true, 3, 5);
        Circle circle = new Circle("red", false, 1.5);
        Triangle triangle = new Triangle("blue", true, 4, 4, 4);

        shapes.add(square);
        shapes.add(rect);
        shapes.add(circle);
        shapes.add(triangle);
        for (Shape shape : shapes) {
            System.out.println("\n" + shape.toString());
        }
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName() + ", Area: " + shape.getArea());
        }

        Shape highestPerimeter = shapes.getFirst();
        for (Shape shape : shapes) {
            if (shape.getPerimeter() > highestPerimeter.getPerimeter()) {
                highestPerimeter = shape;
            }
        }
        System.out.println("Highest perimeter: " + highestPerimeter.getName() + " " + highestPerimeter.getPerimeter());
    }
}

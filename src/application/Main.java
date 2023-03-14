package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(3.0));
        circles.add(new Circle(2.0));

        System.out.printf("Total area: %.2f%n", totalArea(shapes));
        System.out.printf("Total area: %.2f", totalArea(circles));
    }

    private static double totalArea(List<? extends Shape> shapeList) {
        double sum = 0.0;

        for (Shape shape : shapeList) {
            sum += shape.area();
        }

        return sum;
    }
}

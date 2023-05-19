package org.example;

public class Main {
  public static void main(String[] args) {
    Shape square = new Square(5);
    Shape circle = new Circle(5);
    Shape triangle = new Triangle(1, 2, 3, 4);
    Shape rectangle = new Rectangle(1, 2);

    Shape[] shapes = new Shape[] {square, circle, triangle, rectangle};

    for (Shape shape : shapes) {
      System.out.println("Area: " + shape.getArea());
      System.out.println("Perimeter: " + shape.getPerimeter());
    }
  }
}
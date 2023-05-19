package org.example;

public class Circle extends Shape {

  private static final double PI_NUMBER = 3.14;
  private double radius;

  public Circle(double diameter) {
    this.radius = diameter;
  }

  @Override
  public double getArea() {
    return radius * radius * PI_NUMBER;
  }

  @Override
  public double getPerimeter() {
    return radius * PI_NUMBER * 2;
  }
}

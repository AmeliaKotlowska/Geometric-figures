package org.example;

public class Rectangle extends Shape {

  private double sideA;
  private double sideB;

  public Rectangle(double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  public Rectangle() {
  }

  @Override
  public double getArea() {
    return sideA * sideB;
  }

  @Override
  public double getPerimeter() {
    return sideA * 2 + sideB * 2;
  }
}

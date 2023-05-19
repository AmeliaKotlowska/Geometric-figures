package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {
  @Test
  void shouldGetRectangleArea() {
    //given
    double sideA = 2;
    double sideB = 4;
    //when
    Rectangle rectangle = new Rectangle(sideA, sideB);
    //then
    Assertions.assertEquals(8, rectangle.getArea());
  }

  @Test
  void shouldGetRectanglePerimeter() {
    //given
    double sideA = 2;
    double sideB = 4;
    //when
    Rectangle rectangle = new Rectangle(sideA, sideB);
    //then
    Assertions.assertEquals(12, rectangle.getPerimeter());
  }

  @Test
  void shouldGetTriangleArea() {
    //given
    double sideA = 2;
    double sideB = 3;
    double sideC = 1;
    double height = 4;
    //when
    Triangle triangle = new Triangle(sideA, sideB ,sideC, height);
    //then
    Assertions.assertEquals(4, triangle.getArea());
  }

  @Test
  void shouldGetTrianglePerimeter() {
    //given
    double sideA = 2;
    double sideB = 3;
    double sideC = 1;
    double height = 4;
    //when
    Triangle triangle = new Triangle(sideA, sideB ,sideC, height);
    //then
    Assertions.assertEquals(6, triangle.getPerimeter());
  }

  @Test
  void shouldGetCircleArea() {
    //given
    double radius = 2;
    //when
    Circle circle = new Circle(radius);
    //then
    Assertions.assertEquals(12.56, circle.getArea());
  }

  @Test
  void shouldGetCirclePerimeter() {
    //given
    double radius = 2;
    //when
    Circle circle = new Circle(radius);
    //then
    Assertions.assertEquals(12.56, circle.getPerimeter());
  }

  @Test
  void shouldGetSquareArea() {
    //given
    double sideA = 2;
    //when
    Square square = new Square(sideA);
    //then
    Assertions.assertEquals(4, square.getArea());
  }

  @Test
  void shouldGetSquarePerimeter() {
    //given
    double sideA = 2;
    //when
    Square square = new Square(sideA);
    //then
    Assertions.assertEquals(8, square.getPerimeter());
  }
}
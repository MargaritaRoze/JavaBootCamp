package sef.module6.activity;

public class Square extends Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }
}

package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String[] args) {
        Shape p1 = new Square(5);
        p1.setColor("Red");

    System.out.println("*** Print the information for Square");
    System.out.println("Color of square" + p1.getColor());
    System.out.println("Area of square:"+ p1.calculateArea());
    System.out.println("Perimeter of square:" + p1.calculatePerimeter());
    }
}

package Class19;

import java.util.Scanner;

public class Shape {
    Scanner sc = new Scanner(System.in);
    double radius;

    Shape(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("The area of the circle is  " + c.areaCircle(3.142));
    }

    static class Circle extends Shape {
        Circle(int radious) {
            super(radious);
        }

        double areaCircle(double PI) {
            double area;
            return area = PI * radius * radius;
        }
    }
}

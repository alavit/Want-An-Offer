package main.java.practice_2;

public class Circle {
    double radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

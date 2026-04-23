package OverviewOOP.homework;

public class Circle {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double chuVi() {
        return radius * 2 * 3.14;
    }

    double dienTich() {
        return radius * radius * 3.14;
    }
}

// ChatGPT suggestion
//public class Circle {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//}

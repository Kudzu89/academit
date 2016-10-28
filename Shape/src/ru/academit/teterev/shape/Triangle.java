package ru.academit.teterev.shape;

public class Triangle implements Shape {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    Triangle(double x1, double x2, double x3, double x4, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(y1, Math.max(y2, y3));
    }

    @Override
    public double getHeight() {
        return Math.max(x1, Math.max(x2, x3));
    }

    @Override
    public double getArea() {
        return ((x1 - x3) * (y2 - y3) * (y1 - y3)) * 0.5;
    }

    @Override
    public double getPerimeter() {
        return (x1 + y1) + (x2 + y2) + (x3 + y3);
    }
}

package ru.academit.teterev.shape;

public class Square implements Shape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getWidth() {
        return sideLength;
    }

    public double getHeight() {
        return sideLength;
    }

    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    public double getPerimeter() {
        return (sideLength * sideLength);
    }
}

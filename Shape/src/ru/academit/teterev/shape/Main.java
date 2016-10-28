package ru.academit.teterev.shape;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(20);
        System.out.println("Квадрат:");
        System.out.printf("%2f площадь %n%2f ширина %n%2f высота %n%2f периметр%n", square1.getArea(), square1.getWidth(), square1.getHeight(), square1.getPerimeter());
        System.out.println();

        Triangle triangle1 = new Triangle(12, 10, 11, 22, 16, 7, 10);
        System.out.println("Треугольник:");
        System.out.printf("%2f площадь %n%2f ширина %n%2f высота %n%2f периметр%n", triangle1.getArea(), triangle1.getWidth(), triangle1.getHeight(), triangle1.getPerimeter());
        System.out.println();

        Rectangle rectangle1 = new Rectangle(22, 44);
        System.out.println("Прямоугольник:");
        System.out.printf("%2f площадь %n%2f ширина %n%2f высота %n%2f периметр%n", rectangle1.getArea(), rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.getPerimeter());
        System.out.println();

        Circle circle1 = new Circle(55);
        System.out.println("Окружность:");
        System.out.printf("%2f площадь %n%2f ширина %n%2f высота %n%2f периметр%n", circle1.getArea(), circle1.getWidth(), circle1.getHeight(), circle1.getPerimeter());
        System.out.println();

        // git troubles


    }
}

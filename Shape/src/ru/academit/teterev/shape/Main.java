package ru.academit.teterev.shape;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(20);
        Triangle triangle1 = new Triangle(40, 20, 30, 60, 20, 40, 80);
        Circle circle1 = new Circle(50);
        Rectangle rectangle1 = new Rectangle(60, 80);

        double[] arrayOfAreas = {square1.getArea(), triangle1.getArea(), circle1.getArea(), rectangle1.getArea()};
        //System.out.println(Arrays.toString(arrayOfAreas));              /*Просмотреть массив*/

        double maxValue = arrayOfAreas[0];
        double theSecondLargest = arrayOfAreas[0];
        for (int i = 1; i < arrayOfAreas.length; i++) {
            if (arrayOfAreas[i] > theSecondLargest) {
                if (arrayOfAreas[i] > maxValue) {
                    maxValue = arrayOfAreas[i];
                } else {
                    theSecondLargest = arrayOfAreas[i];
                }
            }

        }
        System.out.printf("Максимальное значение площади у фигуры = %.2f%n", maxValue);
        System.out.printf("Второе значение площади после максимального = %.2f%n%n",theSecondLargest);
        System.out.printf("Квадрат: %n ширина %.2f%n высота %.2f%n площадь %.2f%n периметр %.2f%n%n", square1.getWidth(), square1.getHeight(), square1.getArea(), square1.getPerimeter());
        System.out.printf("Треугольник: %n ширина %.2f%n высота %.2f%n площадь %.2f%n периметр %.2f%n%n", triangle1.getWidth(), triangle1.getHeight(), triangle1.getArea(), triangle1.getPerimeter());
        System.out.printf("Окружность: %n ширина %.2f%n высота %.2f%n площадь %.2f%n периметр %.2f%n%n", circle1.getWidth(), circle1.getHeight(), circle1.getArea(), circle1.getPerimeter());
        System.out.printf("Прямоугольник: %n ширина %.2f%n высота %.2f%n площадь %.2f%n периметр %.2f%n%n", rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.getArea(), rectangle1.getPerimeter());
    }

}
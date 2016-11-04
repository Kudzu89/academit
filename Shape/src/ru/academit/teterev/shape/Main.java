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
        System.out.println("Максимальное значение площади фигур = " + maxValue);
        System.out.println("Второе значение площади после максимального = " + theSecondLargest);
        System.out.printf("квадрат %2f ");
    }

}
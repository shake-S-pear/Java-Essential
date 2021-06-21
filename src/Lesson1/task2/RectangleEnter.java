package Lesson1.task2;

import java.util.Scanner;

public class RectangleEnter {

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        System.out.println("Enter the first side of the rectangle: ");
        Scanner in1 = new Scanner(System.in);
        double side1 = in1.nextDouble();
        myRectangle.setSide1(side1);

        System.out.println("Enter the second side of the rectangle: ");
        Scanner in2 = new Scanner(System.in);
        double side2 = in2.nextDouble();
        myRectangle.setSide2(side2);

        System.out.println("The area of this rectangle is: " + myRectangle.areaCalculator(side1, side2));
        System.out.println("The perimeter of this rectangle is: " + myRectangle.perimeterCalculator(side1, side2));

    }
}
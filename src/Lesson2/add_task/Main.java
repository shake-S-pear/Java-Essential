package Lesson2.add_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle: ");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        System.out.println("The area of this circle is equal to: " + MyArea.areaOfCircle(radius));

    }

}

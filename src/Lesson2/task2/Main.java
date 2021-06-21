package Lesson2.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2012);
        Car car3 = new Car("white");
        Car car4 = new Car(2002, "green");

        System.out.println("The color of the 1st car is: " + car1.getColor() + "; the year of manufacture of the 1st car: " + car1.getYear());
        System.out.println("The color of the 2nd car is: " + car2.getColor() + "; the year of manufacture of the 2nd car: " + car2.getYear());
        System.out.println("The color of the 3rd car is: " + car3.getColor() + "; the year of manufacture of the 3rd car: " + car3.getYear());
        System.out.println("The color of the 4th car is: " + car4.getColor() + "; the year of manufacture of the 4th car: " + car4.getYear());

    }

}

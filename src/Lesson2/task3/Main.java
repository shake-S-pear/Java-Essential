package Lesson2.task3;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(1940);
        Car car3 = new Car(1960, 56.2);
        Car car4 = new Car(1980, 89.4, 560);
        Car car5 = new Car(2018, 125.5, 430, "red");

        System.out.println("1st car: - the year of manufacture is: " + car1.getYear() +
                '\n' + '\t' + " - the speed is: " + car1.getSpeed() +
                '\n' + '\t' + " - the weight is: " + car1.getWeight() +
                '\n' + '\t' + " - the color is: " + car1.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("2nd car: - the year of manufacture is: " + car2.getYear() +
                '\n' + '\t' + " - the speed is: " + car2.getSpeed() +
                '\n' + '\t' + " - the weight is: " + car2.getWeight() +
                '\n' + '\t' + " - the color is: " + car2.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("3rd car: - the year of manufacture is: " + car3.getYear() +
                '\n' + '\t' + " - the speed is: " + car3.getSpeed() +
                '\n' + '\t' + " - the weight is: " + car3.getWeight() +
                '\n' + '\t' + " - the color is: " + car3.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("4th car: - the year of manufacture is: " + car4.getYear() +
                '\n' + '\t' + " - the speed is: " + car4.getSpeed() +
                '\n' + '\t' + " - the weight is: " + car4.getWeight() +
                '\n' + '\t' + " - the color is: " + car4.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("5th car: - the year of manufacture is: " + car5.getYear() +
                '\n' + '\t' + " - the speed is: " + car5.getSpeed() +
                '\n' + '\t' + " - the weight is: " + car5.getWeight() +
                '\n' + '\t' + " - the color is: " + car5.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

    }
}

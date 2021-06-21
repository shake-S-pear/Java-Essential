package Lesson2.task4;

public class Main {

    public static void main(String[] args) {

        Car carA = new Car();
        Car carB = new Car(1940);
        Car carC = new Car(1960, 56.2);
        Car carD = new Car(1980, 89.4, 560);
        Car carF = new Car(2018, 125.5, 430, "red");

        System.out.println("1st car: - the year of manufacture is: " + carA.getYear() +
                '\n' + '\t' + " - the speed is: " + carA.getSpeed() +
                '\n' + '\t' + " - the weight is: " + carA.getWeight() +
                '\n' + '\t' + " - the color is: " + carA.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("2st car: - the year of manufacture is: " + carB.getYear() +
                '\n' + '\t' + " - the speed is: " + carB.getSpeed() +
                '\n' + '\t' + " - the weight is: " + carB.getWeight() +
                '\n' + '\t' + " - the color is: " + carB.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("3nd car: - the year of manufacture is: " + carC.getYear() +
                '\n' + '\t' + " - the speed is: " + carC.getSpeed() +
                '\n' + '\t' + " - the weight is: " + carC.getWeight() +
                '\n' + '\t' + " - the color is: " + carC.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("4th car: - the year of manufacture is: " + carD.getYear() +
                '\n' + '\t' + " - the speed is: " + carD.getSpeed() +
                '\n' + '\t' + " - the weight is: " + carD.getWeight() +
                '\n' + '\t' + " - the color is: " + carD.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("5th car: - the year of manufacture is: " + carF.getYear() +
                '\n' + '\t' + " - the speed is: " + carF.getSpeed() +
                '\n' + '\t' + " - the weight is: " + carF.getWeight() +
                '\n' + '\t' + " - the color is: " + carF.getColor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - -");

    }
}

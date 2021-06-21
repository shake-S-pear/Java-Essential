package Lesson3.task3;

public class Plane extends Vehicle{

    private int height;
    private int numberOfPassengers;

    public Plane(int coordinateX, int coordinateY, int price, int speed, int yearOfManufacture, int height, int numberOfPassengers) {
        super(coordinateX, coordinateY, price, speed, yearOfManufacture);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void show() {
        System.out.println("         Plane:");
                super.show();
        System.out.println("Number of passengers: " + this.getNumberOfPassengers() +
                '\n' + "Height: " + this.getHeight() +
                '\n' + "- - - - - - - - - - - - - - - - - - -");
    }

}
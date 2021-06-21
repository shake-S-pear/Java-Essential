package Lesson3.task3;

public class Ship extends Vehicle {

    private int numberOfPassengers;
    private String nativePort;

    public Ship(int coordinateX, int coordinateY, int price, int speed, int yearOfManufacture, int numberOfPassengers, String nativePort) {
        super(coordinateX, coordinateY, price, speed, yearOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
        this.nativePort = nativePort;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getNativePort() {
        return nativePort;
    }

    public void show() {
        System.out.println("         Ship:");
                super.show();
        System.out.println("Number of passengers: " + this.getNumberOfPassengers() +
                '\n' + "Native port: " + this.getNativePort() +
                '\n' + "- - - - - - - - - - - - - - - - - - -");
    }
}
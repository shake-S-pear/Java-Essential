package Lesson3.task3;

public class Vehicle {

    public int coordinateX;
    public int coordinateY;
    public int price;
    public int speed;
    public int yearOfManufacture;

    public Vehicle(int coordinateX, int coordinateY, int price, int speed, int yearOfManufacture) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.price = price;
        this.speed = speed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public float getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void show(){
            System.out.println("CoordinateX: " + this.getCoordinateX() +
                    '\n' + "CoordinateY: " + this.getCoordinateY() +
                    '\n' + "Price: " + this.getPrice() +
                    '\n' + "Speed: " + this.getSpeed() +
                    '\n' + "Year of manufacture: " + this.getYearOfManufacture());

    }

}
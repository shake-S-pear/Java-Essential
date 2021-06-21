package Lesson3.task3;

public class Main {

    public static void main(String[] args) {

        Car car = new Car( 87, 100,50000, 200, 1999, "Toyota");
        Ship ship = new Ship(10, 20, 12000000, 60, 2010, 22000, "Mykolaiv");
        Plane plane = new Plane(55, 44, 10000000, 350, 2018, 8000, 350);

        car.show();
        ship.show();
        plane.show();

    }
}

package Lesson6.task3;

public class Main {

    public static void main(String[] args) {

        double distance = 123;

        System.out.println(distance + " m,  in km: " + Distance.Converter.inKm(distance));
        System.out.println(distance + " km, in miles: " + Distance.Converter.inMiles(distance));

    }
}

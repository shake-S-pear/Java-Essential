package Lesson6.task3;

public class Distance {

    public void print(){
        System.out.println("Distance.");
    }

    static class Converter {

        static double inKm (double distance){
            return distance / 1000;
        }

        static double inMiles (double distance){
            return distance / 1.6;
        }
    }
}

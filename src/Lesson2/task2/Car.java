package Lesson2.task2;

public class Car {

    private int year;
    private String color;

    Car(){
        this.year = 1999;
        this.color = "orange";
    }

    public Car(int year) {
        this.year = year;
        this.color = "red";
    }

    public Car(String color) {
        this.color = color;
        this.year = 2000;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() { return year; }

    public String getColor() { return color; }

}

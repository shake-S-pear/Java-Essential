package Lesson2.task3;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    Car(){
        this.year = 1933;
        this.speed = 34.2;
        this.weight = 1000;
        this.color = "blue";
    }

    Car(int year){
        this.year = year;
        this.speed = 80.4;
        this.weight = 600;
        this.color = "black";
    }

    Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 450;
        this.color = "yellow";
    }

    Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "green";
    }

    Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() { return year; }

    public double getSpeed() { return speed; }

    public int getWeight() { return weight; }

    public String getColor() { return color; }
}

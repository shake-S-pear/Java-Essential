package Lesson2.task4;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    Car(){this(1933,34.2, 1000, "blue"); }

    Car(int year){ this( year, 80.4, 600, "black"); }

    Car(int year, double speed){ this(year, speed, 450, "yellow");  }

    Car(int year, double speed, int weight){ this(year, speed, weight, "green"); }

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


//    Задание 4
//    Используя Intelij IDEA создать проект, пакет.
//    (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//    Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//    Перегрузить конструкторы вызывая конструктор из конструктора.
//    Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
package Lesson7.add_task;

public enum Vehicles {

    PLANE (1000, "red"), CAR (200, "blue"), SHIP(20000, "black"), HELICOPTER(800, "white"), BUS(600, "yellow");

    private int price;
    private String color;

    Vehicles (int price, String color){
        this.price = price;
        this.color = color;
    }

    public void getColor(){
        System.out.println("The color is " + color);
    }

    @Override
    public String toString() {
        return name() +
                "\n\t price is: " + price +
                "\n\t color is: " + color;
    }

}
package Lesson3.task3;

public class Car extends Vehicle{

    private String nameOfManufacturer;

    public Car(int coordinateX, int coordinateY, int price, int speed, int yearOfManufacture, String nameOfManufacturer) {
        super(coordinateX, coordinateY, price, speed, yearOfManufacture);
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public String getNameOfManufacturer() { return nameOfManufacturer; }

    public void show(){
        System.out.println("         Car:");
                    super.show();
        System.out.println("Name of manufacturer: " + this.getNameOfManufacturer() +
                '\n' + "- - - - - - - - - - - - - - - - - - -");

    }

}

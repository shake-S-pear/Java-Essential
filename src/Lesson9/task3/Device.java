package Lesson9.task3;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public String toString(String manufacturer, float price, String serialNumber) {
        return "Manufacturer is: " + manufacturer + " , price is: "
                + price + " , serial number is: " + serialNumber;
    }

}

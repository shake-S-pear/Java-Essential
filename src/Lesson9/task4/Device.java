package Lesson9.task4;

import Lesson9.add_task.Animal;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public String toString(String manufacturer, float price, String serialNumber) {
        return "Manufacturer is: " + manufacturer + " , price is: "
                + price + " , serial number is: " + serialNumber;
    }

    public boolean equals(Object obj){
        if (obj.getClass() == Device.class){
            Device d = (Device) obj;
            boolean isManufacturer = d.manufacturer.equals(this.manufacturer);
            boolean isPrice = d.price == this.price;
            boolean isSerialNumber = d.serialNumber.equals(this.serialNumber);
            return isManufacturer && isPrice && isSerialNumber;
        }
        return false;
    }

    public int hashCode(){
        int result = 17;

        result = 37 * result + (manufacturer == null? 0 : manufacturer.hashCode());
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + (serialNumber == null? 0 : serialNumber.hashCode());

        return result;
    }

}

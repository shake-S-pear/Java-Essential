package Lesson9.task3;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor (int resolutionX, int resolutionY){
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() { return resolutionX; }

    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }

    public int getResolutionY() { return resolutionY; }

    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }

    public String toString(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY){
        return "Manufacturer is: " + manufacturer + " , price is: "
                + price + " , serial number is: " + serialNumber
                + ", X = " + resolutionX + " , Y = " + resolutionY;
    }
}

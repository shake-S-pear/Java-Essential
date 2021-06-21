package Lesson9.task4;

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY) {
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() { return resolutionX; }

    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }

    public int getResolutionY() { return resolutionY; }

    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }

    public String toString(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        return "Manufacturer is: " + manufacturer + " , price is: "
                + price + " , serial number is: " + serialNumber
                + ", X = " + resolutionX + " , Y = " + resolutionY;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() == Monitor.class) {
            Monitor m = (Monitor) obj;
            boolean isX = m.resolutionX == this.resolutionX;
            boolean isY = m.resolutionY == this.resolutionY;
            return isX && isY;
        }
        return false;

    }

    public int hashCode(){
        int result = 17;

        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;

        return result;
    }

}

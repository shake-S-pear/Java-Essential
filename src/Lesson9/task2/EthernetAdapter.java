package Lesson9.task2;

public class EthernetAdapter extends Device{

    private int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public String getMac() { return mac; }

    public void setMac(String mac) { this.mac = mac; }
}

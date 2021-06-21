package Lesson9.task4;

public class EthernetAdapter extends Device {

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

    public boolean equals(Object obj){
        if (obj.getClass() == EthernetAdapter.class){
            EthernetAdapter eAdapter = (EthernetAdapter) obj;
            boolean isSpeed = eAdapter.speed == this.speed;
            boolean isMac = eAdapter.mac.equals(this.mac);
            return isSpeed && isMac;
        }
        return false;
    }

    public int hashCode(){
        int result = 17;

        result = 37 * result + speed;
        result = 37 * result + (mac == null? 0 : mac.hashCode());

        return result;
    }

}

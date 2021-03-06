package com.epam.practice7;

public class Adapter extends Device {
    private int speed;
    private String mac;

    public Adapter(String serialNumber, String manufacturer,
                   double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !super.equals(obj)) {
            return false;
        }
        Adapter other = (Adapter) obj;
        return this.speed == other.speed &&
                this.mac == other.mac;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }

}

package smarthome;

public class Light implements SmartDevice {
    private int id;
    private String status;

    public Light(int id) {
        this.id = id;
        this.status = "off";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "light";
    }

    @Override
    public void turnOn() {
        status = "on";
    }

    @Override
    public void turnOff() {
        status = "off";
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + status;
    }
}

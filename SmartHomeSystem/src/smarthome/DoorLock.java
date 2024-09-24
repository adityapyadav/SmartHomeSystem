package smarthome;

public class DoorLock implements SmartDevice {
    private int id;
    private String status;

    public DoorLock(int id) {
        this.id = id;
        this.status = "locked";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "door lock";
    }

    @Override
    public void turnOn() {
        status = "unlocked";
    }

    @Override
    public void turnOff() {
        status = "locked";
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + status;
    }
}

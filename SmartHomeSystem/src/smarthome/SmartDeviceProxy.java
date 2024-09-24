package smarthome;

public class SmartDeviceProxy implements SmartDevice {
    private SmartDevice device;

    public SmartDeviceProxy(SmartDevice device) {
        this.device = device;
    }

    @Override
    public int getId() {
        return device.getId();
    }

    @Override
    public String getType() {
        return device.getType();
    }

    @Override
    public void turnOn() {
        System.out.println("Accessing " + getType() + " with ID " + getId());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Accessing " + getType() + " with ID " + getId());
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}

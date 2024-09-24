package smarthome;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<SmartDevice> devices;
    private List<SmartDeviceObserver> observers;

    public SmartHomeHub() {
        devices = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        notifyObservers();  // Notify observers that a new device has been added
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
        notifyObservers();
    }

    public void addObserver(SmartDeviceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SmartDeviceObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (SmartDeviceObserver observer : observers) {
            observer.update(devices);
        }
    }

    public void turnOnDevice(int id) {
        for (SmartDevice device : devices) {
            if (device.getId() == id) {
                device.turnOn();
                notifyObservers();
                return;
            }
        }
    }

    public void turnOffDevice(int id) {
        for (SmartDevice device : devices) {
            if (device.getId() == id) {
                device.turnOff();
                notifyObservers();
                return;
            }
        }
    }

    public List<SmartDevice> getDevices() {
        return devices;
    }
}

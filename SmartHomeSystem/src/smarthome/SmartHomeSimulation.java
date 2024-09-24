package smarthome;

public class SmartHomeSimulation {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        SmartHomeStatusDisplay display = new SmartHomeStatusDisplay();
        hub.addObserver(display);

        // Create devices
        SmartDevice light = SmartDeviceFactory.createDevice("light", 1);
        SmartDevice thermostat = SmartDeviceFactory.createDevice("thermostat", 2);
        SmartDevice door = SmartDeviceFactory.createDevice("door", 3);

        // Use proxy to access devices
        SmartDeviceProxy lightProxy = new SmartDeviceProxy(light);
        SmartDeviceProxy thermostatProxy = new SmartDeviceProxy(thermostat);
        SmartDeviceProxy doorProxy = new SmartDeviceProxy(door);

        // Add devices to the hub
        hub.addDevice(lightProxy);
        hub.addDevice(thermostatProxy);
        hub.addDevice(doorProxy);

        // Turn on the light
        hub.turnOnDevice(1);
        
        // Simulate changing thermostat temperature
        ((Thermostat) thermostat).setTemperature(75);
        hub.notifyObservers();
    }
}

package smarthome;

public class Thermostat implements SmartDevice {
    private int id;
    private int temperature;

    public Thermostat(int id, int temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "thermostat";
    }

    @Override
    public void turnOn() {
        // No operation for turning thermostat on.
    }

    @Override
    public void turnOff() {
        // No operation for turning thermostat off.
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat is set to " + temperature + " degrees";
    }
}

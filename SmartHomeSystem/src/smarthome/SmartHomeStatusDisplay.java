package smarthome;

import java.util.List;

public class SmartHomeStatusDisplay implements SmartDeviceObserver {

    @Override
    public void update(List<SmartDevice> devices) {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}

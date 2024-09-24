package smarthome;

import java.util.List;

public interface SmartDeviceObserver {
    void update(List<SmartDevice> devices);
}

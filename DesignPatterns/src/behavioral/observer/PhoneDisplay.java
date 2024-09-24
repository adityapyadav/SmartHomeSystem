package behavioral.observer;

public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: Temp=" + temperature + ", Humidity=" + humidity + ", Pressure=" + pressure);
    }
}

package behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.setMeasurements(30.4f, 65.5f, 1012.1f);
    }
}

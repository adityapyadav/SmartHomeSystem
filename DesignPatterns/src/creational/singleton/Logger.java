package creational.singleton;

public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Method to get the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String message) {
        System.out.println("Logging message: " + message);
    }
}

package creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the only instance of Logger
        Logger logger = Logger.getInstance();
        
        // Log messages using the singleton instance
        logger.logMessage("Singleton pattern demonstration.");
    }
}

package singleton;

public class Logger {
    private static Logger INSTANCE;

    public Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

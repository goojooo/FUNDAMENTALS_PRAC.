import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static volatile Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String level, String message) {
        String time = LocalTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("[" + level + "] " + time + " - " + message);
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("INFO", "Server started");
        logger2.log("ERROR", "Something went wrong");

        System.out.println(logger1 == logger2); // true
    }
}
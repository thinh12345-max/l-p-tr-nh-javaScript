import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance;
    private int logCount = 0;

    private Logger() {
        System.out.println("Khởi tạo hệ thống ghi log...");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logCount++;
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + timeStamp + "] LOG #" + logCount + ": " + message);
    }

    public int getLogCount() {
        return logCount;
    }
}

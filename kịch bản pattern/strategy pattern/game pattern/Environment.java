import java.util.Random;

public class Environment {
    private static final String[] EVENTS = {"Enemy Appeared", "River Found", "Cliff Ahead"};

    public static String getRandomEvent() {
        Random rand = new Random();
        return EVENTS[rand.nextInt(EVENTS.length)];
    }
}

import java.util.List;
import java.util.ArrayList;

// Interface Observer
interface Subscriber {
    void update(String news);
}

// Concrete Observer
class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " nhận tin: " + news);
    }
}

// Subject
class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    public void notifyAllSubscribers(String news) {
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }
}

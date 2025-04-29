public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        User u1 = new User("Alice");
        User u2 = new User("Bob");

        agency.addSubscriber(u1);
        agency.addSubscriber(u2);

        agency.notifyAllSubscribers("Bản tin nóng: Lập trình Java rất thú vị!");
    }
}

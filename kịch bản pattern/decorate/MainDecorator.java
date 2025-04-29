public class MainDecorator {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
  System.out.println(coffee.getDescription());
    }
}
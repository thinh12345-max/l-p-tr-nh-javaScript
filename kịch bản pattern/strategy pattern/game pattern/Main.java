import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo nhân vật với đi bộ và đánh đơn giản
        Character hero = new Character(new WalkBehavior(), new SimpleAttack());

        System.out.println("=== Game bắt đầu ===");

        while (true) {
            System.out.println("\nChọn hành động:");
            System.out.println("1. Di chuyển");
            System.out.println("2. Đánh kẻ địch");
            System.out.println("3. Đổi cách di chuyển");
            System.out.println("0. Thoát game");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Đã thoát game.");
                break;
            }

            switch (choice) {
                case 1:
                    hero.move();
                    break;
                case 2:
                    hero.fight();
                    break;
                case 3:
                    System.out.println("Chọn cách di chuyển:");
                    System.out.println("1. Đi bộ");
                    System.out.println("2. Chạy nhanh");
                    System.out.println("3. Bay");
                    System.out.println("4. Bơi");

                    int moveChoice = scanner.nextInt();
                    switch (moveChoice) {
                        case 1:
                            hero.setBehavior(new WalkBehavior());
                            break;
                        case 2:
                            hero.setBehavior(new RunBehavior());
                            break;
                        case 3:
                            hero.setBehavior(new FlyBehavior());
                            break;
                        case 4:
                            hero.setBehavior(new SwimBehavior());
                            break;
                        default:
                            System.out.println("Không hợp lệ.");
                    }
                    break;
                default:
                    System.out.println("Không hợp lệ.");
            }
        }

        scanner.close();
    }
}

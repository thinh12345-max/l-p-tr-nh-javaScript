public class Character {
    private Behavior behavior;
    private AttackStrategy attackStrategy;
    private int lives = 3; // 3 mạng

    public Character(Behavior behavior, AttackStrategy attackStrategy) {
        this.behavior = behavior;
        this.attackStrategy = attackStrategy;
    }

    public void move() {
        behavior.move();
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void fight() {
        if (lives <= 0) {
            System.out.println("Bạn đã hết mạng. Không thể đánh tiếp.");
            return;
        }

        System.out.println("Đang chiến đấu...");
        if (attackStrategy.attack()) {
            System.out.println("Bạn thắng! Nhận thưởng!");
        } else {
            lives--;
            System.out.println("Bạn thua! Bị trừ 1 mạng. Mạng còn lại: " + lives);
            if (lives == 0) {
                System.out.println("GAME OVER!");
            }
        }
    }
}

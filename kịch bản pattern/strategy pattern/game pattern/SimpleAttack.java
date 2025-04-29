public class SimpleAttack implements AttackStrategy {
    public boolean attack() {
        double chance = Math.random(); // Xác suất thắng 50%
        return chance >= 0.5;
    }
}

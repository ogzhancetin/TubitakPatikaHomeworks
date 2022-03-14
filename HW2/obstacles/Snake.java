package HW2.obstacles;

import java.util.Random;

public class Snake extends Obstacle {
    public Snake() {
        super("Yılan", 4, -1, 12, 5);
        Random random = new Random();
        int damage = random.nextInt(6 - 3) + 3;
        this.setDamage(damage);
    }
}
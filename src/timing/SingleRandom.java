package timing;

import java.util.Random;

public class SingleRandom {
    private Random generator;
    private static SingleRandom instance = new SingleRandom();

    private SingleRandom() {
        generator = new Random();
    }

    public void setSeed(int seed) {
        generator.setSeed(seed);
    }

    public int nextInt() {
        return generator.nextInt();
    }

    public static SingleRandom getInstance() {
        return instance;
    }
}
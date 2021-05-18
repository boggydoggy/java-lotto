package LottoAuto;

import java.util.Random;

public class RandomGenerator {
    private final int MAXIMUM_LOTTO_NUMBER = 45;
    private Random random;

    public RandomGenerator() {
        random = new Random();
    }

    public LottoNumber create() {
        return new LottoNumber(random.nextInt(MAXIMUM_LOTTO_NUMBER) + 1);
    }
}

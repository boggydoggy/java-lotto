package LottoAuto;

import java.util.*;

public class Lotto {
    private final int PRICE = 1000;
    private final int LOTTO_SIZE = 6;
    private final int MAXIMUM_LOTTO_NUMBER = 45;

    private LottoNumbers numbers;

    public Lotto() {
        List<Integer> samples = createNumbers();
        Collections.shuffle(samples);

        for(int iterator = 0; iterator < LOTTO_SIZE; iterator++) {
            numbers.add(samples.get(0));
            samples.remove(0);
        }
        sortNumbers();
    }

    public Lotto(LottoNumbers numbers) {
        this.numbers = numbers;
        sortNumbers();
    }

    private List<Integer> createNumbers() {
        List<Integer> samples = new ArrayList<>();
        for(int iterator = 0; iterator < MAXIMUM_LOTTO_NUMBER; iterator++) {
            samples.add(iterator+1);
        }
        return samples;
    }

    private void sortNumbers() {
        Collections.sort(numbers);
    }

    public int getPRICE() {
        return PRICE;
    }

}

package LottoAuto;

import java.util.*;

public class Lotto {
    private final int PRICE = 1000;
    private final int LOTTO_SIZE = 6;
    private List<Integer> numbers = new ArrayList<>();

    public Lotto() {
        List<Integer> samples = createNumbers();
        Collections.shuffle(samples);

        for(int iterator = 0; iterator < LOTTO_SIZE; iterator++) {
            numbers.add(samples.get(0));
            samples.remove(0);
        }
        sortNumbers();
    }
    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
        sortNumbers();
    }

    private List<Integer> createNumbers() {
        List<Integer> samples = new ArrayList<>();
        for(int iterator = 0; iterator < 45; iterator++) {
            samples.add(iterator+1);
        }
        return samples;
    }
    private void sortNumbers() { Collections.sort(numbers); }

    public int getPRICE() { return PRICE; }
    public List<Integer> getNumbers() { return numbers; }
}

package LottoAuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoNumberGenerator {
    private List<Integer> samples;
    private Random random = new Random();

    private final static int MAXIMUM_LOTTO_NUMBER = 45;
    private final static int SIZE_OF_LOTTO_NUMBERS = 6;

    public LottoNumberGenerator() {
        samples = new ArrayList<>();

        for(int iterator = 0; iterator < MAXIMUM_LOTTO_NUMBER; iterator++) {
            samples.add(iterator + 1);
        }

        Collections.shuffle(samples);
    }

    public LottoNumbers createNumbers() {
        List<LottoNumber> numbers = new ArrayList<>();;

        for(int iterator = 0; iterator < SIZE_OF_LOTTO_NUMBERS; iterator++) {
            numbers.add(new LottoNumber(createANumber()));
        }

        return new LottoNumbers(numbers);
    }

    public int createANumber() {
        int randomNumber = samples.get(0);
        samples.remove(0);

        return randomNumber;
    }

}

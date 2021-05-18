package LottoAuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoNumberGenerator {
    private List<Integer> samples;
    private Random random = new Random();

    private final int MAXIMUM_LOTTO_NUMBER = 45;
    private final int LOTTO_SIZE = 6;

    public LottoNumberGenerator() {
        samples = new ArrayList<>();

        for(int iterator = 0; iterator < MAXIMUM_LOTTO_NUMBER; iterator++) {
            samples.add(iterator + 1);
        }

        Collections.shuffle(samples);
    }

    public LottoNumbers createNumbers() {
        List<Integer> choices = new ArrayList<>();
        List<LottoNumber> numbers = new ArrayList<>();

        for(int iterator = 0; iterator < LOTTO_SIZE; iterator++) {
            choices.add(samples.get(0));
            samples.remove(0);
        }

        sortNumbers(choices);
        numbers = convert(choices);

        return new LottoNumbers(numbers);
    }

    public LottoNumber createBonusNumber() {
        int choice = samples.get(0);
        samples.remove(0);

        return new LottoNumber(choice);
    }

    private void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private List<LottoNumber> convert(List<Integer> numbers) {
        List<LottoNumber> convertedNumbers = new ArrayList<>();

        for(Integer iterator: numbers) {
            convertedNumbers.add(new LottoNumber(iterator.intValue()));
        }

        return convertedNumbers;
    }
}

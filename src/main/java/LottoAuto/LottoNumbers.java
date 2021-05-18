package LottoAuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {
    private List<LottoNumber> numbers;
    private final int SIZE_OF_LOTTO_NUMBERS = 6;

    public LottoNumbers(List<LottoNumber> numbers) {
        checkNumberCount(numbers);
        //checkOverlap(numbers);

        this.numbers = numbers;
    }

    private void checkNumberCount(List<LottoNumber> numbers) {
        if(numbers.size() != SIZE_OF_LOTTO_NUMBERS) {
            throw new IllegalArgumentException("로또 1장에 생성되는 수의 갯수는 6개입니다.");
        }
    }

    private void checkOverlap(List<LottoNumber> numbers) {
        for(LottoNumber iterator: numbers) {
            if(Collections.frequency(getNumbers(), iterator) > 1) {
                throw new IllegalArgumentException("로또 1장에는 중복되는 수가 있어선 안 됩니다.");
            }
        }
    }



    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();

        for(LottoNumber iterator: this.numbers) {
            numbers.add(iterator.getNumber());
        }

        return numbers;
    }

    public int getSize() {
        return numbers.size();
    }
}

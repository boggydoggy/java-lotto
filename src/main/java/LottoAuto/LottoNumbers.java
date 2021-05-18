package LottoAuto;

import java.util.List;

public class LottoNumbers {
    private List<LottoNumber> numbers;
    private final int SIZE_OF_LOTTO_NUMBERS = 6;

    public LottoNumbers(List<LottoNumber> numbers) {
        checkNumberCount(numbers);

        this.numbers = numbers;
    }

    private void checkNumberCount(List<LottoNumber> numbers) {
        if(numbers.size() != SIZE_OF_LOTTO_NUMBERS) {
            throw new IllegalArgumentException("로또 1장에 생성되는 수의 갯수는 6개입니다.");
        }
    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }
}

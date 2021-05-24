package LottoAuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {
    private List<LottoNumber> numbers;
    private static final int SIZE_OF_LOTTO_NUMBERS = 6;

    public LottoNumbers(List<LottoNumber> numbers) {
        checkNumberCount(numbers);
        checkOverlap(numbers);
        sortNumbers(numbers);

        this.numbers = numbers;
    }

    private void checkNumberCount(List<LottoNumber> numbers) {
        if(numbers.size() != SIZE_OF_LOTTO_NUMBERS) {
            throw new IllegalArgumentException("로또 1장에 생성되는 수의 갯수는 6개입니다.");
        }
    }

    private void checkOverlap(List<LottoNumber> numbers) {
        List<Integer> convertedNumbers = LottoNumberToInt(numbers);

        for(LottoNumber iterator: numbers) {
            if(Collections.frequency(convertedNumbers, iterator.getNumber()) > 1) {
                throw new IllegalArgumentException("로또 1장에는 중복되는 수가 있어선 안 됩니다.");
            }
        }
    }

    //TODO: sortNumber 구현 및 Test 추가
    private void sortNumbers(List<LottoNumber> numbers) {


        Collections.sort(numbers);
    }

    private List<LottoNumber> IntToLottoNumber(List<Integer> numbers) {
        List<LottoNumber> convertedNumbers = new ArrayList<>();

        for(Integer iterator: numbers) {
            convertedNumbers.add(new LottoNumber(iterator.intValue()));
        }

        return convertedNumbers;
    }

    private List<Integer> LottoNumberToInt(List<LottoNumber> numbers) {
        List<Integer> convertedNumbers = new ArrayList<>();

        for(LottoNumber iterator: numbers) {
            convertedNumbers.add(iterator.getNumber());
        }

        return convertedNumbers;
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

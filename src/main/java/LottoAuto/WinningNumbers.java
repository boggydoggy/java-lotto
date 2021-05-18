package LottoAuto;

import java.util.List;
import java.util.Random;

public class WinningNumbers {
    private final int LOTTO_SIZE = 6;
    private final int MAXIMUM_OF_WINNING_NUMBERS = 45;

    private LottoNumbers numbers;
    private LottoNumber bonusNumber;

    public WinningNumbers() {

    }
    public WinningNumbers(LottoNumbers numbers, LottoNumber bonusNumber) {
        this.numbers = numbers;
        this.bonusNumber = bonusNumber;
    }
}

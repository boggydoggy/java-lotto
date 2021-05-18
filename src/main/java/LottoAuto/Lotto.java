package LottoAuto;

import java.util.*;

public class Lotto {
    private final int PRICE = 1000;

    private LottoNumbers numbers;
    private LottoNumberGenerator lottoNumberGenerator;

    public Lotto() {
        lottoNumberGenerator = new LottoNumberGenerator();

        this.numbers = lottoNumberGenerator.createNumbers();
    }

    public Lotto(LottoNumbers numbers) {
        this.numbers = numbers;
    }

    public int getPRICE() {
        return PRICE;
    }

}

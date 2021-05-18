package LottoAuto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


public class RandomTest {

    private final int MINIMUM_LOTTO_NUMBER = 1;
    private final int MAXIMUM_LOTTO_NUMBER = 45;
    private final int SIZE_OF_LOTTO_NUMBERS = 6;
    private final int MAXIMUM_TRY = 1000;

    @DisplayName("1부터 45까지 중에서 랜덤으로 수를 하나 뽑는다.")
    @Test
    void randomTest() {
        for(int iterator = 0; iterator < MAXIMUM_TRY; iterator++) {
            LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
            assertThat(lottoNumberGenerator.createANumber()).isBetween(MINIMUM_LOTTO_NUMBER, MAXIMUM_LOTTO_NUMBER);
        }
    }

    @DisplayName("로또 1장당 6개의 랜덤 숫자를 생성한다.")
    @Test
    void chooseRandomTest() {
        for(int iterator = 0; iterator < MAXIMUM_TRY; iterator++) {
            LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
            LottoNumbers lottoNumbers = lottoNumberGenerator.createNumbers();

            assertThat(lottoNumbers.getSize()).isEqualTo(SIZE_OF_LOTTO_NUMBERS);

        }
    }

}

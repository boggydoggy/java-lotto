package LottoAuto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoNumbersTest {
    @DisplayName("로또 1장당 6개의 수가 존재한다.")
    @Test
    void lottoNumbersTest() {
        List<LottoNumber> numbers = Arrays.asList(
                new LottoNumber(1),
                new LottoNumber(2),
                new LottoNumber(3),
                new LottoNumber(4),
                new LottoNumber(5),
                new LottoNumber(6));

        LottoNumbers lottoNumbers = new LottoNumbers(numbers);

        assertThat(lottoNumbers.getNumbers()).isSameAs(numbers);
    }

    @DisplayName("로또 1장당 6개의 수가 존재한다.")
    @Test
    void lottoNumbersExceptionTest() {
        assertThatThrownBy(() -> {
            List<LottoNumber> numbers = Arrays.asList(
                    new LottoNumber(1),
                    new LottoNumber(2),
                    new LottoNumber(3));

            LottoNumbers lottoNumbers = new LottoNumbers(numbers);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}

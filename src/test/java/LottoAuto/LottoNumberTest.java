package LottoAuto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoNumberTest {
    @DisplayName("로또 숫자는 1부터 45까지여야 한다.")
    @Test
    void lowerBoundTest() {
        assertThatThrownBy(() -> {
            LottoNumber lottoNumber = new LottoNumber(0);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 숫자는 1부터 45까지여야 한다.")
    @Test
    void upperBoundTest() {
        assertThatThrownBy(() -> {
            LottoNumber lottoNumber = new LottoNumber(46);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}

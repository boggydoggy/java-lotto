package LottoAuto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {
    @DisplayName("로또 1장의 가격은 1000원이다.")
    @Test
    void lottoOneTest() {
        Lotto lotto = new Lotto();

        assertThat(lotto.getPRICE()).isEqualTo(1000);
    }
}

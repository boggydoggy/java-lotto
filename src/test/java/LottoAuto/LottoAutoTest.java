package LottoAuto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoAutoTest {
    @DisplayName("로또 1장의 가격은 1000원이다.")
    @Test
    void lottoOneTest() {
        Lotto lotto = new Lotto();

        assertThat(lotto.getPRICE()).isEqualTo(1000);
    }

    @DisplayName(" 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다")
    @Test
    void lottoBuyTest() {
        int money = 14500;
        LottoAuto lottoAuto = new LottoAuto(money);

        assertThat(lottoAuto.getTickets()).isEqualTo(14);
    }

    /*@DisplayName("로또 번호는 정렬되어야 한다.")
    @Test
    void sortNumbersTest() {
        List<Integer> numbers = Arrays.asList(5,2,6,4,1,3);
        Lotto lotto = new Lotto(numbers);

        assertThat(lotto.getNumbers()).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6));
    }
*/
}

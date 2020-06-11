package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("분리기 테스트")
public class SeparatorTest {

    @Test
    @DisplayName("문자열을 쉼표(,), 콜론(:)으로 분리한다")
    void 문자열_쉼표_또는_콜론_분리() {
        String formula = "1 : 3 , 4 : 3";

        assertThat(Separator.split(formula)).doesNotContain(":", ",").hasSize(4);
    }

    @Test
    @DisplayName("커스텀 구분자로 분리한다")
    void 커스텀_구분자_분리() {
        String customSeparatorFormula = "//;\n1;2;3";

        assertThat(Separator.split(customSeparatorFormula)).doesNotContain(";").hasSize(3);
    }
}

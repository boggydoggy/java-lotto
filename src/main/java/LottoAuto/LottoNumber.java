package LottoAuto;

public class LottoNumber {
    private int number;
    private final int MINIMUM_LOTTO_NUMBER = 1;
    private final int MAXIMUM_OF_WINNING_NUMBERS = 45;

    public LottoNumber(int number) {
        checkBoundValid(number);

        this.number = number;
    }

    private void checkBoundValid(int number) {
        if(number < MINIMUM_LOTTO_NUMBER || number > MAXIMUM_OF_WINNING_NUMBERS) {
            throw new IllegalArgumentException("로또 숫자는 1부터 45까지의 수입니다.");
        }
    }
}

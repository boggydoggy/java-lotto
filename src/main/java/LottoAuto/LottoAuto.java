package LottoAuto;

import java.util.List;

public class LottoAuto {
    //enum 사용처: 숫자 맞춘 갯수 = 등수
    private Lotto lotto = new Lotto();
    private int tickets;
    private List<Integer> winningNumbers;
    private int bonusNumber;
    private int 

    public LottoAuto(int money, List<Integer> winningNumbers, int bonusNumber) {
        this(money);
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }
    public LottoAuto(int money) {
        tickets = money / lotto.getPRICE();
    }


    public int getTickets() { return tickets; }
}

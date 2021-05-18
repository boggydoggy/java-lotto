package LottoAuto;

import java.util.List;

public class LottoAuto {
    //enum 사용처: 숫자 맞춘 갯수 = 등수
    //tickets를 처리할 Lottos 추가예정
    private Lotto lotto = new Lotto();
    private WinningNumbers winningNumbers;
    private int tickets;


    public LottoAuto(int money, List<Integer> numbers, int bonusNumber) {
        tickets = money / lotto.getPRICE();
        //winningNumbers = new WinningNumbers(numbers, bonusNumber);
    }
    public LottoAuto(int money) {
        tickets = money / lotto.getPRICE();
        winningNumbers = new WinningNumbers();
    }


    public int getTickets() { return tickets; }
}

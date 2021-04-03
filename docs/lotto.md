# 로또 요구사항 정리

## 기능 요구사항

- 로또 구입 금액을 입력받아 1000원당 1장씩 발급한다.
    - 구입 금액을 입력받아 발급
    - 금액을 1000으로 나누고 해당 횟수만큼 로또 생성
- 구입 금액을 입력 받아야 함.
- 개수를 출력해야 함.
- 로또 번호를 출력해야 함.
- 당첨번호를 입력받아야 함.
- 당첨 통계를 출력해야 함.
  - 해당 통계는 몇 개 일치했는지 개수를 출력해야 함.
  - 일치한 개수만큼 금액을 계산해야 함.
  - 구입 금액대비 수익률을 출력해야 함.
    - 구입 금액으로 나누고 소수점 둘째자리 까지 반올림한다.
- 2등을 위해 추가 번호를 추첨한다.
  - 당첨 통계에 2등이 추가되어야 한다.
- 수동입력이 되어야 함.
  - 먼저 금액을 계산한 뒤, 수동입력할 개수를 입력
  - 이 때, 수동입력할 개수는 구입한 수량보다 적어야함.
  - 수동입력할 개수만큼 로또 구매
  - Lottos에 수동입력한 로또 추가
  - 수동으로 구매한 경우, 수동으로 x장 자동으로 y장 구매했다고 출력
- 예외 처리를 한다.
  - 리뷰어님 피드백으로 커스텀 예외를 생성해 처리해보자.
  - Optional을 적용해서 NPE가 발생하지 않도록 하자.
  - 예외를 따로 잡아서 뭔가 해줄 수 있는게 있는지 고민이 된다. 다시 입력받는 것 말고는 개발자가 해줄 수 있는게 없는데..
- 인터페이스로 추출할 수 있는 부분을 생각해보자!!

## TDD로 구현하려면..?

- [x] 금액에 해당하는 로또 갯수를 계산해 해당 갯수만큼 로또 목록을 만든다.
- [x] 로또를 생성한다.
- [x] 로또 번호를 자동으로 선택해서 생성한다.
- [x] 로또 번호는 정렬되어야 한다.
- [x] 당첨번호와 로또를 비교한다.
- [x] 여러개의 로또를 생성해서 비교한다.
- [x] 일치한 개수를 계산한다.
- [x] 수익률을 계산한다.
- [x] 5개 일치시 보너스 번호의 매칭 여부를 확인한다.
- [x] 일치하는 개수와 보너스 번호의 매칭 여부를 받아 Rank를 생성하는 테스트를 작성한다.

맞는지는 잘 모르겠지만, 일단 이렇게 진행해보자.
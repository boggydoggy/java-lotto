# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

### Step1 - 문자열 덧셈 계산기
#### 구현 기능 목록
~~* 문자열을 쉼표(,)또는 콜론(:)으로 분리한다.~~
~~* 숫자를 더한다.~~
~~* 커스텀 구분자를 정한다. "//","\n"사이에 있는것이 구분자다.~~
~~* 음수와 숫자 이외의 값은 throw new RuntimeException~~ 
~~* 빈 문자열 또는 null은 0 반환~~
~~* 숫자 하나 입력은 그대로 반환~~
~~* 수식 클래스 추가~~

### Step2 - 로또 (자동)
#### 구현 기능 목록
* 입력뷰
    * 질문출력
    * 질문답변받기
* 출력뷰
    * 구매 로또 번호 출력
    * 통계 출력
* 스캐너
    * 숫자 받기
    * 문자열 받기
* 계산유틸
    * 수익률 계산
    * 소수점 이하 자르기 계산
* 로또번호
    * 45자리 로또 셋팅하기
* 로또기계
    * 로또 번호 뽑아주기
    * 로또 번호 맞추기
* 판매자
    * 로또 팔기
    * 로또 번호 맞춰주기
* 로또티켓
    * 로또 번호 셋팅
    * 당첨 번호 셋팅
* 결과통계
    * 통계 셋팅
    * 총 당첨 금액 주기
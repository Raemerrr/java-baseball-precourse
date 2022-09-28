## 숫자 야구 게임

### 기능 요구 사항
기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

* 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
    * e.g. 상대방(컴퓨터)의 수가 `425`일 때
    * `123`을 제시한 경우 : `1`스트라이크 
    * `456`을 제시한 경우 : `1`볼 `1`스트라이크
    * `789`를 제시한 경우 : 낫싱
* 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게 임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
* 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
* 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
* 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

### 실행 결과
```text
숫자를 입력해 주세요 : 123
1볼 1스트라이크
숫자를 입력해 주세요 : 145
1볼
숫자를 입력해 주세요 : 671
2볼
숫자를 입력해 주세요 : 216
1스트라이크
숫자를 입력해 주세요 : 713
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
1
숫자를 입력해 주세요 : 123
1볼 1스트라이크
…
```
### 기능 목록
- [ ] 입력받은 볼 비교하기
    - [X] 스트라이크 : 같은 수 같은 자리
    - [X] 볼 : 같은 수 다른 자리
    - [X] 낫싱 : 스트라이크, 볼이 전혀 없음
    - [ ] 3자리 수 서로 다른 수 검증
  ```text
  상대방(컴퓨터)의 수가 425일 때,
  123을 제시한 경우 : 1스트라이크, 
  456을 제시한 경우 : 1볼 1스트라이크, 
  789를 제시한 경우 : 낫싱
  ```
- [ ] 상대방(컴퓨터) 숫자 생성 하기
    - [ ] 1 ~ 9 까지 서로 다른 3자리의 수 생성 하기
- [ ] 게임 종료
    - [ ] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료
    - [ ] 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 종료
    - [ ] 종료 조건 이후 다시 시작 or 완전히 종료
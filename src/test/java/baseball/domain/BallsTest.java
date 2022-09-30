package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BallsTest {

    private Balls computer;

    @BeforeEach
    void init() {
        computer = Balls.of(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("3자리 수 서로 다른 수 검증 - 성공")
    void 세자리_수_서로_다른_수_검증_성공() {
        assertDoesNotThrow(() -> new Balls(Arrays.asList(new Ball(0, 1), new Ball(1, 2), new Ball(2, 3))));
    }

    @Test
    @DisplayName("3자리 수 서로 다른 수 검증 - 실패")
    void 세자리_수_서로_다른_수_검증_실패() {
        assertThrows(IllegalArgumentException.class, () -> new Balls(Arrays.asList(new Ball(0, 1), new Ball(1, 1), new Ball(2, 3))));
    }

    @Test
    @DisplayName("세자리 수 검증 - 성공")
    void 세자리_수_검증_성공() {
        assertDoesNotThrow(() -> new Balls(Arrays.asList(new Ball(0, 1), new Ball(1, 2), new Ball(2, 3))));
    }

    @Test
    @DisplayName("세자리 수 검증 - 실패 1")
    void 세자리_수_검증_실패_1() {
        assertThrows(IllegalArgumentException.class, () -> new Balls(Arrays.asList(new Ball(1, 1), new Ball(2, 3))));
    }

    @Test
    @DisplayName("세자리 수 검증 - 실패 2")
    void 세자리_수_검증_실패_2() {
        assertThrows(IllegalArgumentException.class, () -> new Balls(Arrays.asList(new Ball(0, 1), new Ball(1, 1), new Ball(2, 3), new Ball(3, 4))));
    }

    @Test
    @DisplayName("세자리 수 리스트 입력 - 성공")
    void 세자리_수_리스트_입력_성공() {
        assertDoesNotThrow(() -> Balls.of(Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("세자리 수 리스트 입력 - 실패(중복 숫자)")
    void 세자리_수_리스트_입력_실패_중복_숫자() {
        assertThrows(IllegalArgumentException.class, () -> Balls.of(Arrays.asList(1, 3, 3)));
    }

    @Test
    @DisplayName("두자리 수 리스트 입력 - 실패")
    void 두자리_수_리스트_입력_실패() {
        assertThrows(IllegalArgumentException.class, () -> Balls.of(Arrays.asList(1, 3)));
    }

    @Test
    @DisplayName("3 스트라이크")
    void three_strike() {
        Balls user = Balls.of(Arrays.asList(1, 2, 3));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getStrike()).isEqualTo(3);
    }

    @Test
    @DisplayName("2 스트라이크")
    void two_strike() {
        Balls user = Balls.of(Arrays.asList(4, 2, 3));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getStrike()).isEqualTo(2);
    }

    @Test
    @DisplayName("1 스트라이크")
    void one_strike() {
        Balls user = Balls.of(Arrays.asList(4, 5, 3));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getStrike()).isEqualTo(1);
    }

    @Test
    @DisplayName("3 볼")
    void three_ball() {
        Balls user = Balls.of(Arrays.asList(3, 1, 2));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getBall()).isEqualTo(3);
    }

    @Test
    @DisplayName("2 볼")
    void two_ball() {
        Balls user = Balls.of(Arrays.asList(3, 1, 5));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("1 볼")
    void one_ball() {
        Balls user = Balls.of(Arrays.asList(4, 3, 5));
        PlayResult playResult = computer.inning(user);
        assertThat(playResult.getBall()).isEqualTo(1);
    }
}

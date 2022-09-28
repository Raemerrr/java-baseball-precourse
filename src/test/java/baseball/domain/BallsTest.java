package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BallsTest {

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
}

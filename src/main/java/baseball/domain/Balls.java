package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
    private static final int BALLS_SIZE = 3;
    private final List<Ball> balls;

    public Balls(final List<Ball> balls) {
        duplicationValidation(balls);
        ballsSizeValidation(balls);
        this.balls = balls;
    }

    private void duplicationValidation(final List<Ball> balls) {
        Set<Integer> set = new HashSet<>();
        for (final Ball ball : balls) {
            set.add(ball.getNumber());
        }
        if (set.size() != BALLS_SIZE) {
            throw new IllegalArgumentException("옳바른 입력이 아닙니다.");
        }
    }

    private void ballsSizeValidation(final List<Ball> balls) {
        if (balls.size() != BALLS_SIZE) {
            throw new IllegalArgumentException("옳바른 입력이 아닙니다.");
        }
    }
}

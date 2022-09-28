package baseball.domain;

import java.util.Objects;

public class Ball {
    private final int pos;
    private final int number;

    public Ball(final int pos, final int number) {
        this.pos = pos;
        this.number = number;
    }

    public PlayResult play(final Ball other) {
        if (isStrike(other)) {
            return PlayResult.STRIKE;
        }
        if (isBall(other)) {
            return PlayResult.BALL;
        }
        return PlayResult.NOTHING;
    }

    private boolean isStrike(final Ball other) {
        return this.number == other.number && this.pos == other.pos;
    }

    private boolean isBall(final Ball other) {
        return this.number == other.number && this.pos != other.pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return pos == ball.pos && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos, number);
    }
}

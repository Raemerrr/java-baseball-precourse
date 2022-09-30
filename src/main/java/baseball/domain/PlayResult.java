package baseball.domain;

public class PlayResult {
    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void report(final BallStatus play) {
        if (play.isStrike()) {
            this.addStrike();
        }
        if (play.isBall()) {
            this.addBall();
        }
    }

    private void addStrike() {
        this.strike += 1;
    }

    private void addBall() {
        this.ball += 1;
    }
}

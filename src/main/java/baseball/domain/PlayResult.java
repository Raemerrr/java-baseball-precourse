package baseball.domain;

public enum PlayResult {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String description;

    PlayResult(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

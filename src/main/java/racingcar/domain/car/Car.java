package racingcar.domain.car;

public class Car {
    private final String name;
    private int moveCount;

    public Car(String name) {
        this.name = name.trim();
        this.moveCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
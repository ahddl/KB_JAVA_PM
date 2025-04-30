package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@AllArgsConstructor
@Getter
public class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

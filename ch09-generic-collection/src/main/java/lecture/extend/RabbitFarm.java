package main.java.lecture.extend;

    /*
    <T extends Animal> <- Animal은 인터페이스지만,
    인터페이스 타입으로 제한할시에도 implements가 아니라 extends를 사용
    public class RabbitFarm<T extends Rabbit>{
    }
     */

//T 타입 변수는 Rabbit 타입 혹은 Rabbit 하위 타입들만 가능

public class RabbitFarm<T extends Rabbit> {

    private T aminal;

    public RabbitFarm() {
    }

    public RabbitFarm(T aminal) {
        this.aminal = aminal;
    }

    public T getAminal() {
        return aminal;
    }

    public void setAminal(T aminal) {
        this.aminal = aminal;
    }
}


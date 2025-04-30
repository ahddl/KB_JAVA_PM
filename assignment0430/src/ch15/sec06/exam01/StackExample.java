package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack 생성
        Stack<Coin> coinBox = new Stack<>();

        // Coin 객체 추가 (순서 중요)
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 스택이 빌 때까지 하나씩 꺼내면서 출력
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
            }
    }
}

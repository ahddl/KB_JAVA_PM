package basic.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        //익먕 클래스 : 이름 없이 인터페이스 나 추상 클래스를 즉석에서 구현 하는 클래스
        //익명 객체 : 익명 클래스로 만든 객체
        Thread thread = new Thread(new Runnable() { //Runnable을 즉석에서 구현해서 쓰는 방식
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //예외가 발생한 위치 경로를 알려줌 (콘솔에 출력)
                        e.printStackTrace();
                    }
                }
            }
        });

        //별도의 작업 스레드 생성
        thread.start();

        //메인스레드에서는 for 문 동작
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    /*
    왜 Runnable 을 써야할까?
    자바에서 스레드를 만드는 방법은 두가지 1) Thread 클래스 상속 2) Runnable 인터페이스 구현
    이유1) 다른 클래스 상속 할 수 있게 함
    -> 자바는 클래스 하나만 상속가능 Runnable은 인터페이스이므로 상속하고도 구현이 가능
    class MyClass extends Thread, OtherClass {  ❌ 안됨
    class MyClass extends OtherClass implements Runnable {  ✅ 됨
    이유2) 코드 재사용 유연
    Runnable은 작업을 담고 있는 클래스, 스레드가 아님!
    => Runnable 더 선호
     */

/*
start()와 run()의 차이?
start() = 새 스레드를 생성하고 run() 실행 -> 멀티스레드 동작
run() = 그냥 메서드 실행 -> 멀티스레드 XXX, 일반 함수임.
 */
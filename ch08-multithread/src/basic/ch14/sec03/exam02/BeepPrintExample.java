package basic.ch14.sec03.exam02;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableClass());  //새로운 스레드 만드는

        thread.start(); //작업 스레드 실행 -> 소리만 나게 함 (RunnableClass에 소리나게하는거 있음)

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package ch11.sec03.exam03;
//2가지 예외 동일 처리
public class ExceptionHandlingExample {
    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 에러 발생");
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터 에러 발생");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}

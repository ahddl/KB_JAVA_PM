package ch11.sec03.exam01;
//다중 catch 예외 처리
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i=0; i<=array.length; i++) {
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }catch (NumberFormatException e){
                System.out.println("숫자 에러 발생");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스 에러 발생");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }


        }

    }

}
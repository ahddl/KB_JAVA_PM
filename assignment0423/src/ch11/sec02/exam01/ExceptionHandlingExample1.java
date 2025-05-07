package ch11.sec02.exam01;
//catch 예외 처리
public class ExceptionHandlingExample1 {

    public static void printLength(String data) {
        try{
            int result = data.length();
            System.out.println("문자 수: " + result);
        }catch (NullPointerException e){
            System.out.println("에러 발생");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);  //data ㅡ> null 값; null.length() 값 없음 예외 발생
        System.out.println("[프로그램 종료]");

    }

}
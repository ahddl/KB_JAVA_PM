package ch12.sec05;

public class StringBuilderExample {

    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")  //DEF
                .insert(0, "ABC")  //ABCDEF
                .delete(3, 4)  //3번 부터 4번 미만! 삭제
                .toString();
        System.out.println(data);  //결과 : ABCEF

    }
}

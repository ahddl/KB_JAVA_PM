package basic.ch02.sec01;

public class Type {
    public static void main(String[] args) {
        /*
        선언 방법
        자료형 변수명;
        자료형
        -> 다양한 값의 형태별로 어느정도의 크기를
        하나의 값으로 취급할 것인지 미리 complier 와 약속하는 키워드
         */

        //정수형
        //1byte = 8bit
        byte bnum;  //1byte
        short snum; //2byte
        int inum;   //4byte
        long lnum;  //8byte

        //실수형
        float fnum;  //4byte
        double dnum; //8byte

        //문자형
        char ch; //2byte

        //논리형
        boolean isTrue; //1byte

        //문자열
        String str; //4byte
    }
}

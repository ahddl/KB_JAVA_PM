package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        //이스케이프 문

        String name = "홍길동";
        String job = "프로그래머";

        //\" 큰따옴표 표시
        //\' 작은 따옴표 표시
        String str = "나는 \"자바\"를 배웁니다. "    ;
        System.out.println("str="+str);

        //\t 탭
        str = "번호\t이름\t직업";
        System.out.println("str="+str);

        //\n 줄바꿈
        str = "나는 \n자바\n를 배웁니다. ";
        System.out.println("str = " + str);

        // ++ 자바에서는 변수에 새로운 값을 할당하면 기존 값은 덮어씌워지고, 최신 값만 남게 된다.
    }
}

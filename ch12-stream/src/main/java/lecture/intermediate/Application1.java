package lecture.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /*
        Filter: 스트림에서 특정 데이터만 걸러내는 메소드
        함수형 인터페이스인 Predicate 를 매개 변수로 받음

        (필터랑 맵을 가장 많이 사용함)
         */
        IntStream intStream = IntStream.range(0,10);

        intStream.filter(i-> (i%2)==0)
                .forEach(i-> System.out.println(i+" "));
    }
}

package lecture.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        /*
        sorted(Compartor<>())
        스트림에 담긴 데이터들을 정렬해서 반환
         */

        List<Integer> integerlist = IntStream.of(5,10,99,2,4,6)
                .boxed() //각 정수를 Integer 형태로 반환
//                .sorted()
                .sorted(Comparator.reverseOrder())//역순으로 정렬
                .toList(); //리스트로 변환

        System.out.println(integerlist);
    }
}

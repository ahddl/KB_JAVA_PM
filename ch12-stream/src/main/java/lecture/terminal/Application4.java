package lecture.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
        match

        anyMatch -> 하나라도 조건이 만족하는 값이 있는지
        allMatch -> 모든 조건을 만족하는지
        noneMatch -> 모든 조건을 만족하지 않는지
         */

        List<String> stringList = Arrays.asList("java", "Spring", "SpringBoot");

        //문자열에 "p"가 표함된게 있는지 확인
        //하나라도 조건을 만족하는지 확인
        boolean anyMatch = stringList.stream()
                .anyMatch(str-> str.contains("p"));

        System.out.println("anyMatch: "+anyMatch);

        //모든 조건을 만족하는지 확인
        boolean allMatch = stringList.stream()
                .anyMatch(str-> str.contains("p"));

        System.out.println("allMatch: "+allMatch);

        //모든 조건을 만족하지 않는지 확인
        boolean noneMatch = stringList.stream()
                .anyMatch(str-> str.contains("c"));

        System.out.println("noneMatch: "+noneMatch);

    }
}

package lecture.date;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        //Date 연도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제출력" + legacyDate); //1900이 + 되어서 출력됨
    }
}

package basic.ch18.sec14.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
Writer
- 문자기반출력 스트림의 최상위 추상클래스
- 2 바이트 단위로 처리
- 주로 FileWriter, InputStreamWriter 등을 사용
 */
public class WriteExample {
    public static void main(final String[] args) {
        try (
                Writer writer = new FileWriter("test.txt");
        ) {
            char a = 'A';
            writer.write(a);

            char b = 'B';
            writer.write(b);

            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

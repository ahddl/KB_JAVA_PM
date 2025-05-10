package basic.ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        String fileRoute = "c:/temp/test1.db";

        try (InputStream is = new FileInputStream(fileRoute)) {
            while(true) {
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

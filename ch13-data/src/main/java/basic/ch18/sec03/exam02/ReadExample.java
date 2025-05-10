package basic.ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        String fileRoute = "c:/temp/test2.db";

        try (InputStream is = new FileInputStream(fileRoute)) {
            byte[] data = new byte[1024];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for(int i=0; i<num; i++){
                    System.out.println(data[i]);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

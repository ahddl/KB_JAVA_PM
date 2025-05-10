package basic.ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        String fileRoute = "c:/temp/test1.db";

        try (OutputStream os = new FileOutputStream(fileRoute)) {

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
package basic.ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        String fileRoute = "c:/temp/test2.db";

        try (OutputStream os = new FileOutputStream(fileRoute)) {

            byte[] array = {10, 20, 30};

            os.write(array);
            os.flush();
            os.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

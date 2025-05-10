package basic.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";
        try (
            InputStream in = new FileInputStream(originalFileName);
            OutputStream out = new FileOutputStream(targetFileName);
        ){
            byte[] buf = new byte[1024];
            while(true){
                int len = in.read(buf);
                if (len == -1) break;
                out.write(buf, 0, len);
            }
            out.flush();
            out.close();
            System.out.println("복사 완료");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

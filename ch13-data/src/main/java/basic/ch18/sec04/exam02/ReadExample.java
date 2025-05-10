package basic.ch18.sec04.exam02;

import org.w3c.dom.CDATASection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        String textfile = "c:/temp/test.txt";

        try  {
            Reader reader = new FileReader(textfile);

            while (true) {
                int re = reader.read();
                if (re == -1) break;

                System.out.print((char) re);
            }

            reader.close();
            System.out.println();

            reader = new FileReader(textfile);
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

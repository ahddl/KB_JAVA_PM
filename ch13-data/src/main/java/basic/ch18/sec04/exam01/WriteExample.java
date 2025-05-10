package basic.ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        String textfile = "c:/temp/test.txt";

        try (Writer in = new FileWriter(textfile)) {
            char a = 'A';
            char b = 'B';
            char[] arr = {'C', 'D', 'E'};

            in.write(a);
            in.write(b);
            in.write(arr);

            in.flush();
            in.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
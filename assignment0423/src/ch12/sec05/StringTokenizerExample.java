package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";

        System.out.println("[Split 메서드 이용]");
        String[] arr1 = data1.split("&|,");

        for(String token : arr1) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이수홍/박연수";

        System.out.println("[String Tokenizer 이용]");
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }

}

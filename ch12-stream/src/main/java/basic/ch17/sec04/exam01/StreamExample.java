package basic.ch17.sec04.exam01;

import basic.ch17.sec03.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //List 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Product product = new Product(i, "상품" + i, "멋진회사", (int) (10000 * Math.random()));
            list.add(product);
//            System.out.println(product);
        }
        Stream<Product> productStream = list.stream();
        productStream.forEach(s->System.out.println(s));

    }
}
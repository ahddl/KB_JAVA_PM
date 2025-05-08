package basic.ch17.sec04.exam01;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString

public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

    public Product( int pno, String name, String company, int price) {
        this.company = company;
        this.name = name;
        this.pno = pno;
        this.price = price;
    }
}

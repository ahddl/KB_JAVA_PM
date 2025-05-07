package advanced.ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeset = new TreeSet<>(new FruitComparator());

        treeset.add(new Fruit("포도",3000));
        treeset.add(new Fruit("수박",5000));
        treeset.add(new Fruit("딸기",9000));

        for(Fruit f : treeset){
            System.out.println(f.getName() + " : " + f.getPrice());
        }
    }
}

package advanced.ch15.sec05.exam03;

/*
Comparable을 구현해서 Person 객체간의 정렬 기준을 정의
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person( int age, String name) {
        this.age = age;
        this.name = name;
    }


    /*
    Comparable
    - 이 객체들끼리 기본 정렬(순서)를 어떻게 할 것인지에 결정하는 인터페이스

    compareTo 메서드
    - 음수 : this.age < o.age -> this 객체가 o 객체보다 앞에 위치
    - 0 : this.age == o.age -> 순서 변경 없음
    - 양수 : this.age > o.age -> this 객체가 o 객체보다 뒤에 위치

    Collections.sort() 등의 정렬 메서드는 이 반환값을 참조하여 객체들의 순서를 결정
     */
    @Override
    public int compareTo(Person o) {
        if(this.age < o.age){
            return -1;
        }else if(this.age== o.age){
            return 0;
        }else {
            return 1;  //this가 o 보다 뒤로 가도록
        }
    }
}

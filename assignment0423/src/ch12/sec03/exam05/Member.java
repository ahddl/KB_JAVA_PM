package ch12.sec03.exam05;


import lombok.*;

@Getter  //Getter/Setter 메서드
@Setter
@NoArgsConstructor  //기본 생성자
@AllArgsConstructor  //전체 필드를 초기화하는 생성자
@EqualsAndHashCode  //equals(), hashCode()
@ToString  //toString()
public class Member {
    private String id;
    private String name;
    private int age;
}


//Alt + 7 => 위의 메서드들이 제대로 생성되었는지 IntelliJ의 Structure 기능으로 확인
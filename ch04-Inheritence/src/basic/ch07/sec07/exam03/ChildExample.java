package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //업 캐스팅
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
        참조 변수 parent의 **타입은 Parent**입니다.
        자식 객체를 참조하고 있지만,
        Parent 타입 변수로는 Parent에 선언된 멤버만 접근 가능
        실제 객체는 Child이지만, 컴파일러는 참조 변수 타입만 보고 접근 가능한 멤버를 결정
         */
//        오류 발생
//        parent.field2 = "data2";
//        parent.method3();

        //다운 캐스팅
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();


        /*
업캐스팅 (Child → Parent) | 자동 가능, 부모 클래스의 멤버만 접근 가능
다운캐스팅 (Parent → Child) | 명시적 형변환 필요, 자식 멤버 접근 가능 단, 실제 객체가 자식이어야 함
         */
    }
}

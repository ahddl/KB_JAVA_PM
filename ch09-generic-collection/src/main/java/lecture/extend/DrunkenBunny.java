package main.java.lecture.extend;

public class DrunkenBunny extends Bunny{
    //@Override 어노테이션은
    // 부모 클래스나 인터페이스로부터 상속한 메서드를
    // 자식 클래스에서 재정의(override)할 때 사용
    @Override
    public void cry(){
        System.out.println("토끼 술취함 ㅎㅎㅎㅎㅎㅎㅎ");
    }
}

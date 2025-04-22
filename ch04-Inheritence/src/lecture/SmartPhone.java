package lecture;

public class SmartPhone extends Product{
    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod 오버라이딩한 메소드 호출..!");
    }
}

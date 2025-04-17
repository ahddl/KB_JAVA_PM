package lecture.calculator;

public class CalculatorExample {
    //컴파일러가 만들어준다
    public static void main(String[] args) {
        double pi = Calculator.PI;
        System.out.println(pi);

        Calculator cal1 = new Calculator();
        cal1.z = 10;
        System.out.println(cal1.z);
//        cal1.PI =15;  // final 을 붙였으므로 오류가 발생함

        Calculator cal2 = new Calculator();
        cal2.z = 20;
        System.out.println(cal2.z);


        //인스턴스를 만들지 않아도 클래스 이름."" 으로 참조 할수있음
        System.out.println(Calculator.plus((int) pi, 5));
    }
}

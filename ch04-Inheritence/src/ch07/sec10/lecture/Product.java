package ch07.sec10.lecture;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    public abstract void abstractMethod();
    public void nonstaticMethod() {
        System.out.println("추상클래스안의 nonStaticMethod() 호출됨");
    };
    public static void staticMethod() {
        System.out.println("추상클래스안의 StaticMethod() 호출됨");
    };

}

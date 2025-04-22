package advanced.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();  //객체 만드는 것
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}

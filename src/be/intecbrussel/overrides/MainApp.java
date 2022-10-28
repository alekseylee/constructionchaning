package be.intecbrussel.overrides;

public class MainApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

//        dog.sound();
//        cat.sound();

        String a = new String("Hi");
        String b = new String ("Hi");
        String c = new String("Hello");

        System.out.println(a.equals(b));

        System.out.println(dog1.equals(dog2));

    }
}

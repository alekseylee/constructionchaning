package be.intecbrussel.oefening5;

public class MainApp {
    public static void main(String[] args) {
        Suv suv = new Suv("red", 0, 250, true);
        Cabrio cabrio = new Cabrio("yellow", 0, 200, true);
        Electric electric = new Electric(0, 60, "green");


        suv.accelerate(50);
        cabrio.accelerate(50);
        electric.accelerate(50);

        System.out.println(suv);
        System.out.println(cabrio);
        System.out.println(electric);

        Car[] cars = {suv, cabrio, electric};

        for (Car elements : cars) {
            System.out.println(elements);
        }
    }
}

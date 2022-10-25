package be.intecbrussel.overridesoefening;

public class SchoolShape extends Shape {

    public SchoolShape(int countForms) {
        super(countForms);
    }

    @Override
    public void myShape() {
        System.out.println("I have school shape");
    }
    int countForms = 1000;
}

package be.intecbrussel.overridesoefening;

public class WorkShape extends Shape {

    public WorkShape(int countForms) {
        super(countForms);
    }

    @Override
    public void myShape() {
        System.out.println("I have work shape");
    }
}

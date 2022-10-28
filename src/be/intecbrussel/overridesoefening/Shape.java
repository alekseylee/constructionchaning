package be.intecbrussel.overridesoefening;

import java.util.Objects;

public class Shape {
    private int countForms;

    public Shape(int countForms) {
        this.countForms = countForms;
    }

    public void myShape(){
        System.out.println("This is my form");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return countForms == shape.countForms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countForms);
    }

    @Override
    public String toString() {
        return "{" +
                "=" + countForms +
                '}';
    }


}

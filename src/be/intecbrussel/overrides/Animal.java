package be.intecbrussel.overrides;

import java.util.Objects;

public class Animal {

private String name;
    public void sound(){
        System.out.println("Animal make a sound");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
                "='" + name + '\'' +
                '}';
    }
}

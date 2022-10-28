package be.intecbrussel.example;

public class Tree {

    // propertie
    private String name;

    // constructors
    public Tree() {
        System.out.println("Super class");
    }

    public Tree(String name) {
        this.name = name;
        System.out.println("Super class all args Tree class");
    }

    // getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // eigen methode
    public void typeOfTree() {
        System.out.println("This is a tree");
    }

}

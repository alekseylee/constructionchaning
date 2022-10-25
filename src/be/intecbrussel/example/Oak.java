package be.intecbrussel.example;

public class Oak extends Tree{

    // properties
    public int height = 5;
    private int age;
    private String color;

    // no-args constructor
    // constructor overloading
    public Oak() {
        //this(200);
        System.out.println("constructor no args oak");
    }

    // constructor 1 parameter
    public Oak(int height) {
        //this(200, 2 , "blue");
        this.height = height;
        System.out.println("constructor 1 para oak");
    }

    // all args constructor
    public Oak(int height, int age, String color) {
        setHeight(height);
        this.age = age;
        this.color = color;
        System.out.println("constructor all args oak");

    }

    public int getHeight() {
        return height;
    }

    // encapsulation
    public void setHeight(int height) {

        if(height < 200) {
            this.height = height;
        } else {
            System.out.println("Niet goed");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Oak{" +
                "height=" + height +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}

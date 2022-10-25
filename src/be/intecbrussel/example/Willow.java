package be.intecbrussel.example;

public class Willow extends Oak {

    private int width;
    private int numberOfLeaves;


    // this() en super() moet op de eerste regel staan
    // this() en super() kunnen niet tergelijk gebruikt
    // worden

    public Willow() {
        this(10, 10);

        System.out.println("Willow class no args");
    }

    public Willow(int width, int numberOfLeaves) {
        super();
        this.width = width;
        this.numberOfLeaves = numberOfLeaves;
        System.out.println("Willow class all args");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    // methode overloading
    public int calculateMass(int width) {
        return width * super.height;
    }

    public double calculateMass(double width) {
        return width * super.getHeight();
    }

    public void calculateMass() {
        System.out.println("bla bla");
    }


}
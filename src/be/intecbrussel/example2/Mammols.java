package be.intecbrussel.example2;

public class Mammols extends Animal {

    private int legs;

    public Mammols() {
    }

    public Mammols(int legs) {
        this.legs = legs;
    }

    protected int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

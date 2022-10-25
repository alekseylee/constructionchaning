package be.intecbrussel.example2;

public class Cow extends Mammols{

    private String color;

    public Cow() {
        this("black");
    }

    public Cow(String color) {
        super(5);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getSound() {
        super.getSound();
        System.out.println("moe");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "color='" + color + '\'' +
                '}';
    }

}

package be.intecbrussel.oefening5;

public class Cabrio extends Car{
    private boolean sunroof;
    private boolean sunroofOpen;


    //Constructor

    public Cabrio(String color, int speed, int hp, boolean sunroof) {
        super(color, speed, hp);
        this.sunroof = sunroof;
    }

    //Getters and Setters

    public boolean getSunroof() {
        return sunroof;
    }

    public int getSpeed(){
        return super.getSpeed();
    }

    public void setSunroofOpen(boolean sunroofOpen) {
        this.sunroofOpen = sunroofOpen;
    }

    //Methods

    public void openRoof(){
        if (sunroofOpen == false){
            setSunroofOpen(true);
            System.out.println("You open the sunroof");
        }
        else if (sunroofOpen == true){
            setSunroofOpen(false);
            System.out.println("You close the sunroof");
        }
    }

    @Override
    public void slow(int amount) {
        super.slow(amount);
    }

    @Override
    public void park() {
        super.park();
    }


}

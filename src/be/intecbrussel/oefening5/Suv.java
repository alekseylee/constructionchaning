package be.intecbrussel.oefening5;

public class Suv extends Car {
    private boolean bullbar;
    private boolean mode4x4Driving = false;

    //Constructor

    public Suv(String color, int speed, int hp, boolean bullbar) {
        super(color, speed, hp);
        this.bullbar = bullbar;
    }


    public int getSpeed(){
        return super.getSpeed();
    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void setMode4x4Driving(boolean mode4x4Driving) {
        this.mode4x4Driving = mode4x4Driving;
    }

    //Methods

    public void mode4x4driving(boolean mode4x4driving){
        if (mode4x4driving == false){
            setMode4x4Driving(true);
            System.out.println("You are now in 4X4 mode");
        } else if (mode4x4driving == true) {
            setMode4x4Driving(false);
            System.out.println("You have now exited 4X4 mode");
        }
    }

    @Override
    public void accelerate(int amount) {
        if (mode4x4Driving == false){
            super.accelerate(amount);
        }
        else if (mode4x4Driving == true && getSpeed() < 30){
            super.accelerate(amount);
        }
        else {
            System.out.println("Car in 4X4 mode can't go faster than 30. If you want to accelerate you have to exit 4X4 mode");
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

package be.intecbrussel.oefening5;

public class Electric extends Car{
    public Electric(int speed, int battery, String color) {
        super(speed, battery, color);
    }

    //Getters and setters

    public int getSpeed(){
        return super.getSpeed();
    }

    //Method

    public void charge(int battery){
        if (battery<=0){
            battery=100;
            System.out.println("Your battery is now fully charged");
        }
        else {
            System.out.println("Your battery is already fully charged");
        }
    }

    public void accelerate (int amount) {
        super.accelerate(amount);
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

package be.intecbrussel.example;

public class MainApp {

    public static void main(String[] args) {

        // object aanmaken van oak class
        Oak oak = new Oak();
        //oak.typeOfTree();
        //System.out.println(oak.getColor());

        Willow wil = new Willow(10,9);
        //wil.typeOfTree();
        int result = wil.calculateMass(10);
        //System.out.println(result);

        wil.calculateMass();
    }

}
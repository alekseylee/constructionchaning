package be.intecbrussel.oefening1;

import java.util.Scanner;

public class Invoice {

    private double invoice;

    public Invoice() {

    }

    public Invoice(double invoice) {
        this.invoice = invoice;
    }

    public double discount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your summary: ");
        invoice = scan.nextDouble();
        for (int i = 0; i < 1; i++) {

            if (invoice >= 5000) {
                double discount = invoice - (0.05 * invoice);
                System.out.println("You have 5% discount: " + (invoice - discount));
                System.out.println("Your invoice with discount is: " + discount);
                break;

            }
            else if (invoice < 5000) {
                System.out.println("Sorry, we can't give you discount.");
            }
            break;
        } return invoice++;


//        if (invoice >= 5000) {
//            System.out.println("You have 5% discount and your invoice is: ");
//            return this.invoice - (0.05 * invoice);
//        } else if (invoice < 5000) {
//            System.out.println("Sorry, we can't give you discount.");
//        }
//        return invoice;


    }
}


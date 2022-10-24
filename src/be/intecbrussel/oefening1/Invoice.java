package be.intecbrussel.oefening1;

import java.util.Scanner;

public class Invoice {

    private double invoice;

    public Invoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your summary: ");
        this.invoice = scan.nextDouble();
    }

    public Invoice(double invoice) {
        this.invoice = invoice;
    }

    public double discount() {
        if (invoice > 5000) {
            System.out.println("Your discount is: " + (invoice * 0.05));
            System.out.println("Your invoice is: ");
            return this.invoice - (0.05 * invoice);
        } else {
            return this.invoice;
        }
    }
}


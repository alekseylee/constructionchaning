package be.intecbrussel.oefening3;

import java.util.Scanner;

public class PostalNumber {

    private String input;

    Scanner scan = new Scanner(System.in);

    public PostalNumber(){
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        if (input == "Aalst") {
            System.out.println(input + " has postal code 9300");
        } else if (input == "Antwerpen") {
            System.out.println(input + " has postal code 2000");
        } else if (input == "Brussel") {
            System.out.println(input + " has postal code 1000");
        } else if (input == "Dendermonde") {
            System.out.println(input + " has postal code 9200");
        } else if (input == "Gent") {
            System.out.println(input + " has postal code 9000");
        } else if (input == "Kortrijk") {
            System.out.println(input + " has postal code 8500");
        } else if (input == "Oudenaarde") {
            System.out.println(input + " has postal code 9700");
        } else if (input == "Turnhout") {
            System.out.println(input + " has postal code 2300");
        } else if(input == "9300") {
            System.out.println(input + " is Aalst's postal code");
        } else if (input == "2000") {
            System.out.println(input + " is Antwerpen's postal code");
        }else if (input == "1000") {
            System.out.println(input + " is Brussel's postal code");
        }else if (input == "9200") {
            System.out.println(input + " is Gent's postal code");
        }else if (input == "9000") {
            System.out.println(input + " is Kortrijk's postal code");
        }else if (input == "9700") {
            System.out.println(input + " is Oudenaarde's postal code");
        }else if (input == "2300") {
            System.out.println(input + " is Turnhout's postal code");
        } else {
            System.out.println("You input invalid postal code or name of city");
        }

    }
}


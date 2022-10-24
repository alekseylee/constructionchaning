package be.intecbrussel.oefening2;

import java.util.Random;
import java.util.Scanner;

public class Password {
    String[] array = {"z", "l", "N", "O", "k", "J", "e", "5", "8", "1", "2", "3", "4", "6", "7", "9", "q", "m", "M"};

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void generatePassword() {
        int a = random.nextInt(array.length);
        int b = random.nextInt(array.length);
        int c = random.nextInt(array.length);
        int d = random.nextInt(array.length);
        int e = random.nextInt(array.length);
        String[] arrayPass = {array[a], array[b], array[c], array[d], array[e]};
        System.out.print("The password is: ");
        for (int i = 0; i < arrayPass.length; i++) {
            System.out.print(arrayPass[i]);
        }
        System.out.println();
        System.out.println("One more generate password?");
        for (int i = 0; ; ) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                generatePassword();

            } else if (answer.equals("no")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Answer not valid");
            }

        }
    }
}







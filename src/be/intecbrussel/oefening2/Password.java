package be.intecbrussel.oefening2;

import java.util.Random;
import java.util.Scanner;

//    int[] numbers = {number};
    //        String[] letters = {"a", "b", "c", "d", "w", "f", "t", "h", "p", "o", "l", "k", "m", "n", "z"};
//
//        Arrays.sort(numbers);
//        System.out.println("\nThe sorted numbers are: ");
//        for (double num : numbers) {
//            System.out.print(num + " | ");
//        }
//
//        Arrays.sort(letters);
//        System.out.println("\nThe sorted letters are: ");
//        for (String let : letters) {
//            System.out.print(let + " ");
//        }
public class Password {
    public String generate(char[] validchars, int len) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to generate: ");
        int num = scan.nextInt();
        char[] password = new char[num];
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < num; i++) {
            password[i] = validchars[rand.nextInt(validchars.length)];

        }

        return new String(password);
    }
}






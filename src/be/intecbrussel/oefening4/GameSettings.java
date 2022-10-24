package be.intecbrussel.oefening4;

import java.util.Scanner;

public class GameSettings {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        for (int i = (int)((Math.random()*10) +1); i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int correctNum = (int) ((Math.random() * 100) + 1);
                int tries = 0;
                System.out.println(i);

            }
        }
    }
}
//        System.out.println("Array elements are: ");
//        for (int i=0; i<n; i++)
//        {
//            System.out.println(array[i]);
//        }
//        public void play()
//        {
//            boolean playing = true;
//            int correctNum = (int) ((Math.random() *100) + 1);
//            //selects random double from [1,101) and then rounds down
//            int tries = 0;
//
//            while (playing)
//            {
//                Scanner input = new Scanner(System.in);
//
//                System.out.println("enter a number 1-100");
//                int guess = input.nextInt();
//
//                if(guess < correctNum){
//                    System.out.println("number is too low!");
//                    tries++;
//                }
//                else if(guess > correctNum){
//                    System.out.println("Number is too high!");
//                    tries++;
//                }
//                else if(guess == correctNum){
//                    System.out.println("correct!");
//                    if (tries > 1)
//                        System.out.println("Congrats, you guessed the right number. It only took you " + tries + " attempts!");
//                    else
//                        System.out.println("You guessed it first try! good job");
//                }
//                else{
//                    System.out.println("not a valid option");
//                }
//
//            }
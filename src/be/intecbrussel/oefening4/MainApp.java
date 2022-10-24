package be.intecbrussel.oefening4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int [][]array = new int[10][10];
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        for (int i = 0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print("-  ");
            }
            System.out.println();
        }
        System.out.println("Find the Easter egg,give a row (0-9)");
        int row,kolumn;
        for (; ; ) {
            row = in.nextInt();
            if (row > a && row < 10)
                System.out.println("The egg lies more to the north");
            else if (row < a && row >= 0)
                System.out.println("The egg lies more to the south");
            else if (row >= 10 || row < 0)
                System.out.println("Row not found");

            else {
                row=a;
                break;
            }
        }

        System.out.println("Enter a column (0-9):");
        for (; ; ) {
            kolumn = in.nextInt();
            if (kolumn > b && kolumn < 10)
                System.out.println("The egg lies more to the east");
            else if (kolumn < b && kolumn >= 0)
                System.out.println("The egg lies more to the west");
            else if (kolumn >= 10 || kolumn < 0)
                System.out.println("Row not found");

            else {
                kolumn=b;
                break;
            }
        }
        for (int i = 0; i<10; i++){
            for (int j=0; j<10; j++){
                if (i==row && j==kolumn)
                    System.out.print("x  ");
                else
                    System.out.print("-  ");
            }
            System.out.println();
        }
        System.out.println("You found the egg!\n");

    }
}
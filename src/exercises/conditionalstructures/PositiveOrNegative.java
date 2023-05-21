package exercises.conditionalstructures;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        /* Make a program that asks for a value and shows
       on the screen if the value is positive or negative! */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scan.nextInt();

        if (number >= 0) {
            System.out.println("Positive Number!");
        } else {
            System.out.println("Negative Number");
        }
    }
}
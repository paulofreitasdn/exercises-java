package exercises.conditionalstructures;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        /* Write a program that asks for an integer and
           determines whether it is odd or even. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.print(number + " is an even number!");
        } else {
            System.out.print(number + " is an odd number!");
        }
    }
}
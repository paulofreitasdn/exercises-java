package exercises.conditionalstructures;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Write a program that calculates the factorial of a user-supplied integer!

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scan.nextInt();

        int factorial = 1;

        while (number >= 1) {
            factorial *= number;
            number--;
        }
        System.out.println("The factorial of the entered number is: " + factorial);
    }
}

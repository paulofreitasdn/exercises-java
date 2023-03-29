package exercises;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {

        /* Make a program that asks for two numbers and checks
        (using if and else) the largest of them */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scan.nextInt();

        int bigger = 0;

        if (number1 > number2) {
            bigger = number1;
        } else {
            bigger = number2;
        }
        System.out.print("The biggest number is: " + bigger);
    }
}
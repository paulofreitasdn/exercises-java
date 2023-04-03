package exercises;

import java.util.Scanner;

public class BiggerOrSmaller {

    public static void main(String[] args) {

        /* Make a program that reads three numbers, checks (using if and else) and
        prints the largest and smallest of them! */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number1 = scan.nextInt();

        System.out.print("Enter another number:");
        int number2 = scan.nextInt();

        System.out.print("Enter another number:");
        int number3 = scan.nextInt();

        int bigger;
        int smaller;

        if (number1 > number2 && number1 > number3) {
            bigger = number1;
        } else if (number2 > number1 && number2 > number3) {
            bigger = number2;
        } else {
            bigger = number3;
        }
        System.out.println("The biggest number is: " + bigger);

        if (number1 < number2 && number1 < number3) {
            smaller = number1;
        } else if (number2 < number1 && number2 < number3) {
            smaller = number2;
        } else {
            smaller = number3;
        }
        System.out.println("The smallest number is: " + smaller);
    }
}
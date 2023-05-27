package exercises.conditionalstructures;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        /* Write a program that reads a number and displays the corresponding day
        of the week, however, if you type another value, an invalid value should appear! */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Sunday");
        } else if (number == 2) {
            System.out.println("Monday");
        } else if (number == 3) {
            System.out.println("Tuesday");
        } else if (number == 4) {
            System.out.println("Wednesday");
        } else if (number == 5) {
            System.out.println("Thursday");
        } else if (number == 6) {
            System.out.println("Friday");
        } else if (number == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid value!");
        }
    }
}
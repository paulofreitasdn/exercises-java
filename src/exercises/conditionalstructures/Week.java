package exercises.conditionalstructures;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        /* Write a program that reads a number and displays the corresponding day
        of the week, however, if you type another value, an invalid value should appear! */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        switch (number) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value!");
        }
    }
}
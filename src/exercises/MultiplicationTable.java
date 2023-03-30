package exercises;

import java.util.Scanner;

public class MultiplicationTable {

    // Read a number and calculate and print your table on the screen!

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        for (int start = 0; start <= 10; start++) {

            System.out.println(number + " x " + start + " = " + (number * start));
        }
    }
}
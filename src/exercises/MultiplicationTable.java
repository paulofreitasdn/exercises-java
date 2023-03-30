package exercises;

import java.util.Scanner;

public class MultiplicationTable {

    // Read a number and calculate and print your table on the screen!

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        for (int start = 0; start <= 10; start++) {

            System.out.println(number + " x " + start + " = " + (number * start));
        }
    }
}
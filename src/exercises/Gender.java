package exercises;

import java.util.Scanner;

public class Gender {

    public static void main(String[] args) {

        /* Write a program that checks (using if and else) whether a typed letter is "F" or "M".
        According to the letter write: F - Female, M - Male or Invalid gender. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String letter = scanner.nextLine();

        if (letter.equalsIgnoreCase("M")) {
            System.out.println("Masculine!");
        } else if (letter.equalsIgnoreCase("F")) {
            System.out.println("Feminine!");
        } else {
            System.out.println("Invalid Sex!");
        }
    }
}
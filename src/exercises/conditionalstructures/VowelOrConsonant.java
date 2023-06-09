package exercises.conditionalstructures;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        /* Write a program that checks (using if and else) whether
           typed letter is a vowel or a consonant. */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String letter = scan.nextLine();

        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("E") || letter.equalsIgnoreCase("I") || letter.equalsIgnoreCase("O") || letter.equalsIgnoreCase("U")) {
            System.out.println("The typed letter is a vowel..");
        } else {
            System.out.println("The typed letter is consonant..");
        }
    }
}
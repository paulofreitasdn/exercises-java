package exercises.conditionalstructures;

import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {

        /* Make a program that asks a person's age and says if they can donate
        blood or not. Use some of the OR (||) and AND (&&) logical operators.*/
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 18 && age < 68) {
            System.out.println("You can donate blood!");
        } else {
            System.out.println("Unfortunately its not possible!");
        }
    }
}

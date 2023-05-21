package exercises.conditionalstructures;

import java.util.Scanner;

public class StudySchedule {

    public static void main(String[] args) {

        /* Make a program that asks what shift you study.
           If the user types "Morning", print Good morning!
           otherwise it is "Afternoon", print Good Afternoon!
           otherwise it is "Night", print Good Night.

           if he enters a nonexistent shift, print invalid shift..
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the shift you study:");
        String shift = scanner.nextLine();

        if (shift.trim().equalsIgnoreCase("Morning")) {
            System.out.println("Good Morning!");
        } else if (shift.trim().equalsIgnoreCase("Afternoon")) {
            System.out.println("Good Afternoon!");
        } else if (shift.trim().equalsIgnoreCase("Night")) {
            System.out.println("Good Night!");
        } else {
            System.out.println("The shift entered is invalid!");
        }
    }
}
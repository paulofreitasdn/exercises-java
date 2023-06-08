package exercises.conditionalstructures;

import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {

        /* The algorithm must show on the screen the grades, the average,
        the corresponding grade and the message “APPROVED” if the grade is A, B or C
        and “FAILED” if the grade is D or E.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first note: ");
        double firstNote = scan.nextDouble();

        System.out.print("Enter your second note: ");
        double secondNote = scan.nextDouble();

        double average = (firstNote + secondNote) / 2;

        if (average >= 9 && average <= 10) {

            char concept = 'A';
            System.out.println("First Note: " + firstNote);
            System.out.println("Second Note: " + secondNote);
            System.out.println("Average: " + average);

            System.out.println("Concept: " + concept);
            System.out.println("You were approved!");

        } else if (average >= 7.5 && average < 9) {

            char concept = 'B';
            System.out.println("First Note: " + firstNote);
            System.out.println("Second Note: " + secondNote);
            System.out.println("Average: " + average);

            System.out.println("Concept: " + concept);
            System.out.println("You were approved!");

        } else if (average >= 6 && average < 7.5) {

            char concept = 'C';
            System.out.println("First Note: " + firstNote);
            System.out.println("Second Note: " + secondNote);
            System.out.println("Average: " + average);

            System.out.println("Concept: " + concept);
            System.out.println("You were approved!");

        } else if (average >= 4 && average < 6) {

            char concept = 'D';
            System.out.println("First Note: " + firstNote);
            System.out.println("Second Note: " + secondNote);
            System.out.println("Average: " + average);

            System.out.println("Concept: " + concept);
            System.out.println("You have been disapproved!");

        } else if (average >= 0 && average < 4) {

            char concept = 'E';
            System.out.println("First Note: " + firstNote);
            System.out.println("Second Note: " + secondNote);
            System.out.println("Average: " + average);

            System.out.println("Concept: " + concept);
            System.out.println("You have been disapproved!");

        }
    }
}
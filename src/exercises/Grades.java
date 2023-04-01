package exercises;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        /* Write a program to read two partial grades
           from a student and display the student's status!
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student grade:");
        double note1 = scan.nextDouble();

        System.out.print("Enter the second note:");
        double note2 = scan.nextDouble();

        double med = ((note1 + note2) / 2);

        if (med == 10) {
            System.out.print("Approved with distinction!");
        } else if (med >= 7 && med < 10) {
            System.out.print("Approved!");
        } else {
            System.out.print("Disapproved!");
        }
    }
}
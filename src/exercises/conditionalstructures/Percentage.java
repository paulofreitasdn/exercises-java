package exercises.conditionalstructures;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {

        /* Make a program that receives a collaborator's salary and readjusts
        it according to the following criteria, based on the current salary; */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scan.nextDouble();

        if (salary <= 280.00) {

            int increase = 20;
            double newSalary = (salary * increase) / 100;
            System.out.println("Your salary before the readjustment: " + salary);
            System.out.println("The percentage increase applied: " + increase);
            System.out.println("New Salary: " + (salary + newSalary));

        } else if (salary <= 700.00) {

            int increase = 15;
            double newSalary = (salary * increase) / 100;
            System.out.println("Your salary before the readjustment: " + salary);
            System.out.println("The percentage increase applied: " + increase);
            System.out.println("New Salary: " + (salary + newSalary));

        } else if (salary <= 1500.00) {

            int increase = 10;
            double newSalary = (salary * increase) / 100;
            System.out.println("Your salary before the readjustment: " + salary);
            System.out.println("The percentage increase applied: " + increase);
            System.out.println("New Salary: " + (salary + newSalary));

        } else {

            int increase = 5;
            double newSalary = (salary * increase) / 100;
            System.out.println("Your salary before the readjustment: " + salary);
            System.out.println("The percentage increase applied: " + increase);
            System.out.println("New Salary: " + (salary + newSalary));

        }
    }
}
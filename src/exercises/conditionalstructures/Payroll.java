package exercises.conditionalstructures;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        double workTime = scan.nextDouble();

        System.out.print("Enter the number of hours worked in the month: ");
        double workedHours = scan.nextDouble();

        double grossSalary = workTime * workedHours;
        double discount;

        if (grossSalary <= 900) {
            discount = 0;
        } else if (grossSalary <= 1500) {
            discount = grossSalary * 0.05;
        } else if (grossSalary <= 2500) {
            discount = grossSalary * 0.1;
        } else {
            discount = grossSalary * 0.2;
        }

        double discountInss = grossSalary * 0.1;
        double fgts = grossSalary * 0.11;
        double totalDiscounts = discount + discountInss + fgts;
        double netSalary = grossSalary - totalDiscounts;

        System.out.println("Gross Salary: (" + workTime + " * " + workedHours + "): R$ " + grossSalary);
        System.out.println("IR (5%): R$ " + discount);
        System.out.println("INSS (10%): R$ " + discountInss);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total Discounts: R$ " + totalDiscounts);
        System.out.println("Net Salary: R$ " + netSalary);
    }
}

package exercises.conditionalstructures;

import java.util.Scanner;
import java.util.Locale;

public class Product {
    public static void main(String[] args) {

        /* Make a program that asks the price of three products and
        tells you which product you should buy, knowing that the
        decision is always the cheapest.
         */
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of the product: ");
        double product1 = scan.nextDouble();

        System.out.print("Enter the value of the other product: ");
        double product2 = scan.nextDouble();

        System.out.print("Enter the value of the other product: ");
        double product3 = scan.nextDouble();

        double product;

        if (product1 < product2 && product1 < product3) {
            product = product1;
        } else if (product2 < product1 && product2 < product3) {
            product = product2;
        } else {
            product = product3;
        }
        System.out.println("Recommended Product: " + product);
    }
}
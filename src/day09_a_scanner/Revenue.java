package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a price: $");
        double price = key.nextDouble();
        System.out.print("Enter a quantity: ");
        int quantity = key.nextInt();

        double revenue = price * quantity;

        System.out.println("Your revenue: $" + revenue);

    }
}

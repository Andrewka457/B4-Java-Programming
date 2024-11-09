package day09_b_if_statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.print("What is your balance: $");
        balance = key.nextDouble();
        System.out.println("\nYour balance is: $" + balance);


        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();
        System.out.println("You are requesting to withdraw $" + withdraw);

        balance -= withdraw;
        System.out.println("Your balance is: $" + balance);


        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();
        if (withdraw > balance) {
            System.out.println("Not enough money");
        } else  {
            balance -= withdraw;
            System.out.println("Your balance is: $" + balance);
        }

    }
}

package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int validPin = 7777;
        int userEnteredPin;
        int attemptCount = 0;

        System.out.println("Welcome To ATM");

        do {
            System.out.print("Enter PIN: ");
            userEnteredPin = key.nextInt();
            attemptCount++;
        } while (userEnteredPin != validPin && attemptCount < 3);

        if (attemptCount == 3 && userEnteredPin != validPin) {
            System.out.println("You are locked out.");
        }

    }
}

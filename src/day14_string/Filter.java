package day14_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = key.nextLine();

        message = message.trim();
        message = message.toLowerCase();

        boolean hasBadPhrase = message.contains("java is bad") || message.contains("quit") || message.contains("Have fun") || message.contains("crying");

        if (hasBadPhrase) {
            System.out.println("Message failed to send!");
        } else {
            System.out.println("\"" + message + "\" sent!");
        }

    }
}

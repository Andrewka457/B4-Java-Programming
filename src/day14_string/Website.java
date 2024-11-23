package day14_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a website: ");
        String websiteUrl = key.next().toLowerCase();

        boolean isValidBeginning = websiteUrl.startsWith("www.");
        boolean isValidEnd = websiteUrl.endsWith(".com") || websiteUrl.endsWith(".edu") || websiteUrl.endsWith(".gov") || websiteUrl.endsWith(".net") || websiteUrl.endsWith(".io");

        if (isValidBeginning && isValidEnd) {
            System.out.println("It is valid website");
        } else {
            System.out.println("It is not valid website");

            if (!isValidBeginning) {
                System.out.println("\tInvalid beginning");
            }

            if (!isValidEnd) {
                System.out.println("\tInvalid ending");
            }
        }

    }
}

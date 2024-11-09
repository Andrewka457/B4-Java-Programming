package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter your favorit book: ");
        String book = key.nextLine();
        System.out.print("Enter your age: ");
        byte age = key.nextByte();
        System.out.print("Enter your favorit number: ");
        long number = key.nextLong();

        System.out.println("Info you entred:");
        System.out.println("\t" + book);
        System.out.println("\t" + age);
        System.out.println("\t" + number);



    }
}

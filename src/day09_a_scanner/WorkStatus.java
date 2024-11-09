package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String name = key.next();
        System.out.print("Please enter your last name: ");
        String lastname = key.next();
        System.out.print("Are you employed (true / false): ");
        boolean isEmployed = key.nextBoolean();
        System.out.print("Are you a student (true / false): ");
        boolean isStudent = key.nextBoolean();

        System.out.println("Information about " + name + " "+ lastname);
        System.out.println("\tIs employed: " + isEmployed);
        System.out.println("\tIs Student: " + isStudent);

    }
}

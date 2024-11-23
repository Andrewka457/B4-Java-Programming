package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = key.next();
        System.out.print("Enter your lastname: ");
        String lastname = key.next();

        System.out.println("" + name.toUpperCase().charAt(0) + lastname.toUpperCase().charAt(0));

    }
}

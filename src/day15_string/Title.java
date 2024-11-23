package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter tour name with title: ");
        String name = key.nextLine().toLowerCase();

        if (name.startsWith("mr.") || name.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms.") || name.startsWith("madam") || name.startsWith("miss")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you senior");
        } else if (name.endsWith("jr")) {
            System.out.println("Nice to meet you junior");
        }

    }
}

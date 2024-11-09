package day09_a_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("What day is today? ");
        String day = key.nextLine();

        System.out.print("Enter your first name: ");
        String name = key.next();

        System.out.print("Enter your last name: ");
        String lastname = key.next();

        key.nextLine();// to handle the ENTER issue

        System.out.print("Enter your address: ");
        String address = key.nextLine();

        //Rule with .nextLine ----> if there are any other Scanner methods than .nextLine(), we need handle it with extra .nextLine()

        System.out.print("Enter job title:" );
        String job = key.nextLine();

        System.out.print("Enter couple names:" );
        String names = key.nextLine();

        System.out.print("Enter your favorit number: ");
        int number = key.nextInt();

        key.nextLine();

        System.out.print("Enter couple words:" );
        String words = key.nextLine();

    }
}

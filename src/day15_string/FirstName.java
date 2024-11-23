package day15_string;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = key.nextLine().trim().toLowerCase();
        System.out.print("Enter your last name: ");
        String lastName = key.nextLine().trim().toLowerCase();

        System.out.println("------------------------------------------");

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println("Your full name: " + firstName + " " + lastName);



    /*
            Ask a user to give a full name
            Then ask a user
                Which od the following options you would like to do?
                    1. Make all UPPER case
                    2. Make all lower case
                    3. Make each word capitalized

                    You option: 1, 2, 3
                    
                 Then print out what user gave you as full name in the option they selected
     */

        System.out.print("Enter your full name: ");
        String fullName = key.nextLine().toLowerCase();

        System.out.print("Which od the following options you would like to do?\n" +
                "\t\t1. Make all UPPER case\n" +
                "\t\t2. Make all lower case\n" +
                "\t\t3. Make each word capitalized\n" +
                "You option: ");
        int option = key.nextInt();

        switch (option) {
            case 1:
                fullName = fullName.toUpperCase();
                break;
            case 2:
                fullName = fullName.toLowerCase();
                break;
            case 3:
                fullName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, fullName.indexOf(" ")) + " " + fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase() + fullName.substring(fullName.indexOf(" ") + 2);
                break;
            default:
                System.out.println("There is not that option");
                System.exit(0);
        }

        System.out.println(fullName);

    }
}

package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String expectedUsername = "java@gmail.com";
        String expectedPassword = "loopcamp";

        Scanner key = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = key.next().toLowerCase();

        System.out.print("Enter your password:");
        String inputPassword = key.next();

//        if (inputUsername.equals(inputUsername.toLowerCase())) {
//
//        }

        boolean isValid = inputUsername.equals(expectedUsername) && inputPassword.length() == 8 && inputPassword.equals(expectedPassword);
        if (isValid) {
            System.out.println("LOGGED IN");
        } else {
            System.out.println("You have entered either invalid username or password");
            //  homework --> implement the code to give specific message for specific error.

            if (!inputUsername.equals(expectedUsername)) {
                System.out.println("Wrong username");
            }
            if (!inputPassword.equals(expectedPassword)) {
                System.out.println("Wrong password");
            }
            if (inputPassword.length() != 8) {
                System.out.println("Password must be 8 characters length");
            }
        }

    }
}

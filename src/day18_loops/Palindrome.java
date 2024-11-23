package day18_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String word = "javaj";
        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

    }
}

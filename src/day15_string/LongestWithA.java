package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter 3 Strings:");
        System.out.print("\tFirst: ");
        String str1 = key.nextLine();
        System.out.print("\tSecond: ");
        String str2 = key.nextLine();
        System.out.print("\tThird: ");
        String str3 = key.nextLine();

        boolean containsA = str1.toLowerCase().contains("a") || str2.toLowerCase().contains("a") || str3.toLowerCase().contains("a");
        boolean isFirstLongestWithA = str1.toLowerCase().contains("a") && str1.length() > str2.length() && str1.length() > str3.length();
        boolean isSecondLongestWithA = str2.toLowerCase().contains("a") && str2.length() > str1.length() && str2.length() > str3.length();
        boolean isThirdLongestWithA = str3.toLowerCase().contains("a") && str3.length() > str2.length() && str3.length() > str1.length();

        if (containsA) {
            if (isFirstLongestWithA) {
                System.out.println(str1 + " is longest with a");
            } else if (isSecondLongestWithA) {
                System.out.println(str2 + " is longest with a");
            } else if (isThirdLongestWithA) {
                System.out.println(str3 + " is longest with a");
            } else {
                System.out.print("There isn't longest with a, but these words have a: ");
                if (str1.toLowerCase().contains("a")) {
                    System.out.print(str1 + " ");
                }
                if (str2.toLowerCase().contains("a")) {
                    System.out.print(str2 + " ");
                }
                if (str3.toLowerCase().contains("a")) {
                    System.out.print(str3);
                }
            }
        } else {
            System.out.println("There aren't strings with a");
        }
        // Improve the code - implement the option if the words to no hase "a" in it. But if there word with "a" then print that one. HINT: nested if


    }
}

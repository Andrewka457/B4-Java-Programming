package day24_methods;

import day09_a_scanner.YourInfo;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int userBirthYear = key.nextInt();

        calculateAge(userBirthYear);

    }

    public static void calculateAge (int year) {
        int age = 2024 - year;
//        age = Year.now().getValue() - year;
        System.out.println(age);

    }

}

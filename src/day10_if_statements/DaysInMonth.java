package day10_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12 inclusive which represents each month: ");

        int mount = key.nextInt();

        if (1 > mount || mount > 12){
            System.out.println("Invalid input");
        } else if (mount == 2) {
            System.out.println("Month has 28 days");
        } else if (mount == 4 || mount == 6 || mount == 9 || mount == 11) {
            System.out.println("Month has 30 days");
        } else {
            System.out.println("Month has 31 days");
        }

    }
}

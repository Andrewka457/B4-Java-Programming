package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number between 1 - 7 inclusive: ");
        int day = key.nextInt();

        boolean isMonday = day == 1;
        boolean isTuesday = day == 2;
        boolean isWednesday = day == 3;
        boolean isThursday = day == 4;
        boolean isFriday = day == 5;
        boolean isSaturday = day == 6;
        boolean isSunday = day == 7;

        if (isMonday) {
            System.out.println("Monday");
        } else if (isTuesday) {
            System.out.println("Thuesday");
        } else if (isWednesday) {
            System.out.println("Wednesday");
        } else if (isThursday) {
            System.out.println("Thursday");
        } else if (isFriday) {
            System.out.println("Friday");
        } else if (isSaturday) {
            System.out.println("Saturday");
        } else if (isSunday) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input");
        }

    }
}

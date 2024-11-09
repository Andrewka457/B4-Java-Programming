package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();
//        System.out.println(num1);
        System.out.print("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        boolean isEqual = num1 == num2;

        System.out.println("Is " + num1 + " equal to " + num2 + "? - " + isEqual);



    }
}

package day17_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number that you want to see multiplication table from 1 to 10: ");
        int num = key.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}

package day20_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = key.nextInt();
        int count = 0;
        String output = "";

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }

            }

            if (count == 2) {

                output += i + " ";

            }

            count = 0;

        }

        System.out.println(output);

    }
}

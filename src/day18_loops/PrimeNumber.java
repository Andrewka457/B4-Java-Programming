package day18_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int num;
        int count = 0;

        System.out.print("Enter a number: ");
        num = key.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }

        }

        if (count <= 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}

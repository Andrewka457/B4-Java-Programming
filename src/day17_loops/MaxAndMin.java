package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("How many numbers do you want to compare: ");
        int countOfNum = key.nextInt();
        int cicle = 1;
        int userNum;
        int biggest = 0;
        int smallest = 0;

        System.out.println("Enter " + countOfNum + " numbers: ");

        while (countOfNum >= cicle) {
            System.out.print("\tEnter a number " + cicle + ": ");
            userNum = key.nextInt();

            if (cicle == 1 ){
                biggest = userNum;
                smallest = userNum;
            } else if (userNum > biggest) {
                biggest = userNum;
            } else if (userNum < smallest) {
                smallest = userNum;
            }

            cicle++;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

    }

}

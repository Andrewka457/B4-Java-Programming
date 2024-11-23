package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int secretNumber = 777;
        int userGuess;
        int tries = 0;

        do {
            System.out.print("Guess the number: ");
            userGuess = key.nextInt();
            tries++;

            if (userGuess < secretNumber){
                System.out.println("It is too low");
            } else if (userGuess > secretNumber) {
                System.out.println("It is too high");
            } else {
                System.out.println("Congrats");
                System.out.println("After " + tries + "-th try you guessed it.");
            }

        } while (userGuess != secretNumber);

        /*
             Home Practice
                In this code implement a logic that tells me after how may tries, I found the correct
                    - Print "After n-th try you guessed it."

         */


    }
}

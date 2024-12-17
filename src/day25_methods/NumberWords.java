package day25_methods;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = key.nextInt();

        numAsWord(userInput);

        System.out.println();

        System.out.println(numAsWord2(userInput));



    }

    public static void numAsWord (int input) {

//        if (input == 1) {
//            System.out.println("One");
//        } else if (input == 2) {
//            System.out.println("Two");
//        } else {
//            System.out.println("Not valid");
//        }

        String [] numsAsWord = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        if (input < 1 || input > 10) {
            System.out.println("Not valid");
        } else {
            System.out.println(numsAsWord[input-1]);
        }



    }

    public static String numAsWord2 (int input) {

        String [] numsAsWord = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String output;

        if (input < 1 || input > 10) {
            output = "Not valid";
        } else {
            output = numsAsWord[input-1];
        }

        return output;

    }

}

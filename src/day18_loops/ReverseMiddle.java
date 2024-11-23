package day18_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Give a sentence with at least three words: ");
        String sentence = key.nextLine().trim();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){

            count++;

            }
        }

        if (count >= 2) {

            int indexOfFirstSpace = sentence.indexOf(" ");
            int indexOfLastSpace = sentence.lastIndexOf(" ");
            String middle = sentence.substring(indexOfFirstSpace + 1, indexOfLastSpace);
            String reverse = "";

            for (int i = middle.length()-1; i >= 0 ; i--) {
                reverse += middle.charAt(i);
            }

            System.out.println(sentence.substring(0, indexOfFirstSpace+1) + reverse + sentence.substring(indexOfLastSpace));

        } else {
            System.out.println("Invalid input");
        }
    /*
        TODO: Homework
            Ask a user to enter a sentence with at least 3 words until user gives it to you.
    */
    }
}

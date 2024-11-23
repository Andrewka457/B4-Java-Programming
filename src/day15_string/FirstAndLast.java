package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String sentence = key.nextLine();

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length() - 1));

        /*
             get the last char and 2nd last char and check if they are same
                If they are - print "Double same chars at th end"
                If not - pring last two chars are not same
         */
        if (sentence.length() > 1) {

            if (sentence.charAt(sentence.length() - 1) == sentence.charAt(sentence.length() - 2)) {
                System.out.println("Double same chars at th end");
            } else {
                System.out.println("Last two chars are not same");
            }
        }

    }
}

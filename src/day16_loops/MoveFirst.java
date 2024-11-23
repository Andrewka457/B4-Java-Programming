package day16_loops;

import java.util.Scanner;

public class MoveFirst {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = key.nextLine().trim();

        if (sentence.contains(" ")) {
            sentence = sentence.substring(sentence.indexOf(" ") + 1) + " " + sentence.substring(0, sentence.indexOf(" "));
        }

        System.out.println(sentence);

    }
}

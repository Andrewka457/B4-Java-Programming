package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String sentence;
        int count = 1;

        System.out.print("Enter a sentence: ");
        sentence = key.nextLine().trim();

        if (!sentence.isEmpty()) {

            for (int i = 0; i < sentence.length(); i++) {

                if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '_') {

                    count++;

                }

            }

            System.out.println("there are " + count + " words in the sentence.");

        } else {
            System.out.println("there are 0 words in the sentence.");

        }

    }
}

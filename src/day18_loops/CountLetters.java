package day18_loops;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String word;
        String letter;
        int counter = 0;

        System.out.print("Enter a word: ");
        word = key.nextLine();
        System.out.print("Enter a single letter for counting:");
        letter = key.next();

        if (letter.length() == 1) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter.charAt(0)) {

                    counter++;

                }
            }

            System.out.println("\"" + letter + "\" letter has quantity in word \"" + word + "\": " + counter);
        } else {
            System.out.println("Invalid input");
        }



    }
}

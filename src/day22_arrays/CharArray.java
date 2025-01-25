package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String word = "loopcamp";
        System.out.println(word.length());
        System.out.println(word);

        System.out.println();

        char [] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        System.out.println(letters.length);
        System.out.println(Arrays.toString(letters));

        System.out.println();

        char [] wordLetters = new char [word.length()];
        System.out.println(wordLetters.length);
        System.out.println(Arrays.toString(wordLetters));

        System.out.println();

        for (int i = 0; i < word.length(); i++) {
            wordLetters [i] = word.charAt(i);
        }

        System.out.println(Arrays.toString(wordLetters));

        System.out.println();

        char [] wordLetters2 = word.toCharArray();
        System.out.println(Arrays.toString(wordLetters2));

        char [] letters3 = "Wednesday".toCharArray();
        System.out.println(Arrays.toString(letters3));
        System.out.println(letters3);

        String word3 = new String(letters3);

        System.out.println(word3);


    }
}

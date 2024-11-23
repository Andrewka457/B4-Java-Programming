package day18_loops;

public class CharactersInString {
    public static void main(String[] args) {

        String word = "Andrey";

        for (int i = 0; i < word.length(); i++) {

            System.out.print(word.charAt(i) + 0 + " ");
            System.out.print( (int)word.charAt(i) + " ");

        }

    }
}

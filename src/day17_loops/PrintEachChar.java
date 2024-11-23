package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {

     String word = "loopcamp";

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        System.out.println("-----------------");

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
        }

        System.out.println("-------------------");

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println(reversed);

    }
}

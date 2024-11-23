package day15_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String word = "Saturday";

        System.out.println(word.substring(0));
        System.out.println(word.substring(1));
        System.out.println(word.substring(2));
        System.out.println(word.substring(3));
        System.out.println(word.substring(4));

        System.out.println("Sat" + word.substring(3));

        System.out.println();

        System.out.println(word.substring(1, 2));
        System.out.println(word.substring(0, 3));

        System.out.println();

        System.out.println(word.substring(5, 8));
        //System.out.println(word.substring(5, 9));
        System.out.println(word.substring(5));

    }
}

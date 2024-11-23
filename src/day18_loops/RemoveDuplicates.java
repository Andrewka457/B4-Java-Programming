package day18_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abcabbcd";
        String unigue = "";
        char eachChar;

        for (int i = 0; i < str.length(); i++) {

            eachChar = str.charAt(i);

            if (!unigue.contains("" + eachChar)) {

                unigue += eachChar;

            }

        }

        System.out.println(unigue);
    }
}

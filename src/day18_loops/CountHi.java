package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String word = "aaaaaaaahihivcdgscvschibvhshicsvfhi";
        int count = 0;

        while (word.contains("hi")) {

            count++;
            word = word.substring(word.indexOf("hi")+2);

        }

        System.out.println("You got " + count + " times \"hi\" in word");

    }
}

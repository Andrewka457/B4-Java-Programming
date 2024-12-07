package day24_methods;

public class LastCharacters {
    public static void main(String[] args) {

        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        for (String [] eachSingleArr : words) {
            String lastChars = "";
            for (String eachElem : eachSingleArr) {

                lastChars += eachElem.charAt(eachElem.length() - 1);

            }

            System.out.println(lastChars);

        }

        /*
        TODO: Practice
                Implement the same code with traditional loop: fori
         */

    }

}

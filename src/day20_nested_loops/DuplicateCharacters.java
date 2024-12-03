package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "applle";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            char eachLetter1stLoop = str.charAt(i);

            if (str2.contains(eachLetter1stLoop + "")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                char eachLetter2ndLoop = str.charAt(j);

                if (eachLetter1stLoop == eachLetter2ndLoop) {
                    count++;
                }

            }

            if (count > 1 ) {
                str2 += eachLetter1stLoop + " ";
            }


        }

        System.out.println(str2);

    }
}

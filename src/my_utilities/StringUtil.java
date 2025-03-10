package my_utilities;

public class StringUtil {
    /**
     * This method returns the reversed version of the Strin
     * @param str given String
     * @returns the reversed version
     */
    public static String reverse (String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt( i );
        }
        return reversed;
    }

    /**
     * This method fixes the format of the name
     * @param input is provided name
     * @return the fixed format
     */
    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;

    }
    /**
     * This method calculates how many times the given letter is in the given String
     * @param str given String
     * @param letter given letter
     * @return the number of the occurrence of letter in String
     */
    public static int frequencyOfLetters (String str, char letter){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }
    /**
     * This method finds the character which are in the String more thant once.
     * @param str is the given String
     * @returns the letter which occurs more than once
     */
    public static String duplicateCharacters (String str) {

        String unique = "";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetterLoop1 = str.charAt(i);

            if (unique.contains(eachLetterLoop1 + "")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachLetterLoop2 = str.charAt(j);
                if (eachLetterLoop1 == eachLetterLoop2) {
                    count++;
                }
            }

            if (count > 1) {
                duplicates += eachLetterLoop1;
            }

            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }
        }
        return duplicates;
    }

    /**
     * This method finds the character which are in the String only once
     * @param str is the given String
     * @returns the letter which occurs only once
     */
    public static String uniqueCharacters (String str) {
        String unique =  "";

        for (int i = 0; i <str.length(); i++) {

            char eachChar = str.charAt(i);


            if (StringUtil.frequencyOfLetters(str, eachChar)== 1){
                unique += eachChar;
            }

        }


        return unique;
    }

    /**
     * This method transform given String in camelCase format
     * @param str is the given String
     * @return String in camelCase format
     */
    public static String camelCase(String str) {

        str = str.trim();

        while (str.contains(" ")) {
            str = str.replaceFirst(" " + str.charAt(str.indexOf(" ") + 1), "" + (char) (str.charAt(str.indexOf(" ") + 1) - 32));
        }
        return str;
    }

    /**
     * This method transform given String of words as array with wrong quotes in real String array
     * @param str is the given String
     * @return valid String array
     */
    public static String [] antiFeyruz (String str) {
        return str.replace("”", "").replace("“", "").replace("{", "").replace("}", "").split(", ");
    }

}

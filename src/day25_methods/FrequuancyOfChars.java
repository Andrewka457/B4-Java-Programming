package day25_methods;

import my_utilities.StringUtil;

public class FrequuancyOfChars {
    public static int frequencyOfLetters (String str, char letter){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }


    public static int frequencyOfLetters2 (String str, char letter){
        int count = 0;

        //char [] arr =  str.toCharArray();
        for (char each : str.toCharArray()) {
            if (each == letter){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int num1 = frequencyOfLetters("apple", 'p');
        System.out.println(num1);
        System.out.println(  frequencyOfLetters2("apple", 'p')  );

        System.out.println(StringUtil.frequencyOfLetters("apple", 'z'));

    }
}

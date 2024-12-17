package day25_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.fixFormat("jaMES"));

        System.out.println(StringUtil.frequencyOfLetters("loopcamp", 'o'));

        System.out.println(StringUtil.reverse("loopcamp"));

        String str = StringUtil.duplicateCharacters("loopcamp");
        System.out.println(str);

        System.out.println(StringUtil.duplicateCharacters("apple"));

    }
}

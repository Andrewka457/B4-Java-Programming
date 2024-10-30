package day5_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'А';
        char letter2 = 'н';
        char letter3 = 'д';
        char letter4 = 'р';
        char letter5 = 'е';
        char letter6 = 'й';

        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5 + letter6);
        System.out.println("" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6);

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6;
        System.out.println(myName);

    }
}

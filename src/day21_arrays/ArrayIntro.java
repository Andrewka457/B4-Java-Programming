package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str1 = "Denver";

        char letter1 = str1.charAt(0);
        char letter2 = str1.charAt(1);
        char letter3 = str1.charAt(2);
        char letter4 = str1.charAt(3);
        char letter5 = str1.charAt(4);
        char letter6 = str1.charAt(5);

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);

        System.out.println();

        String str2 = "Chicago Fairfax NewYork Boston";
        String city1 = "Chicago";
        String city2 = "Fairfax";
        String city3 = "NewYork";
        String city4 = "Boston";

//        String [] cities;

        //Directly
        String [] cities1 = {"Chicago", "Fairfax", "NewYork", "Boston"};
//        String [] cities1 = {city1, city2, city3, city4};

        //size only
        String [] cities2 = new String[4];

        System.out.println(cities1[0]);
        System.out.println(cities1[1]);
        System.out.println(cities1[2]);
        System.out.println(cities1[3]);
//        System.out.println(cities1[4]); //Exception

        System.out.println();

        System.out.println(cities2[0]); //null
        System.out.println(cities2[1]); //null
        System.out.println(cities2[2]); //null
        System.out.println(cities2[3]); //null
//        System.out.println(cities2[4]); //Exception

        System.out.println();

        System.out.println(cities1);//Hashcode / memory location
        System.out.println(Arrays.toString(cities1));

        System.out.println();

        String arrayToString = Arrays.toString(cities1);
        System.out.println(arrayToString);

        arrayToString = arrayToString.substring(1, arrayToString.length() - 1);
        System.out.println(arrayToString);

        arrayToString = arrayToString.replace(",", "");
        System.out.println(arrayToString);

        System.out.println();

        String [] cities3 = {"Chicago", "Fairfax", "NewYork", "Boston", "Chantilly", "Fall Church"};
        System.out.println(cities3.length);


    }
}

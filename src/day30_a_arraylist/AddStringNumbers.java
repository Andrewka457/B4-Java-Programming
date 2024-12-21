package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static void main(String[] args) {

        ArrayList <String> numsAsString = new ArrayList<>();
        numsAsString.addAll(Arrays.asList("123", "34", "513"));
        System.out.println("Original: " + numsAsString);
        System.out.println(sumOfElementsString(numsAsString));


    }

    public static ArrayList <Integer> sumOfElementsString (ArrayList <String> numsAsString) {

        ArrayList <Integer> resultList = new ArrayList<>();

        for (String each: numsAsString) {

//            System.out.println(each);

            int sumOfAll = 0;
            for (String eachLetter : each.split("")) {

                sumOfAll += Integer.parseInt(eachLetter);

            }
            resultList.add(sumOfAll);
        }

        return resultList;
    }

}

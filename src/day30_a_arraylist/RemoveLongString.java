package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println("Original: " + list);

        System.out.println("Updated: " + removeLongStrings(list, 4));
        System.out.println("Updated: " + removeLongStrings(list, 5));
        System.out.println("Updated: " + removeLongStrings(list, 10));

    }

    public static ArrayList <String> removeLongStrings (ArrayList <String> list, int num){

        ArrayList <String> updatedList = new ArrayList<>(list);
        updatedList.removeIf(eachElem -> eachElem.length() < num);

        return updatedList;
    }

}

package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SwitchPairs {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        System.out.println("Original: " + list);

        System.out.println(switchPairs(list));

    }

    public static ArrayList <String> switchPairs (ArrayList <String> list) {

        ArrayList <String> switchedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {

            Collections.swap(list, i, i+1);

        }

        switchedList.addAll(list);

        return switchedList;
    }

}

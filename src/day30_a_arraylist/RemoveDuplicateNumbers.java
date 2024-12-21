package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateNumbers {

    public static ArrayList <Integer> unigueList2 (ArrayList <Integer> nums) {

        ArrayList <Integer> uniqueList2 = new ArrayList<>();
        for ( Integer each : nums){
            if (Collections.frequency(nums, each) == 1){
                uniqueList2.add(each);
            }
        }
        return uniqueList2;
    }

    public static ArrayList <Integer> uniqueList (ArrayList <Integer> nums) {

        ArrayList <Integer> uniqueList = new ArrayList<>(nums);

        uniqueList.removeIf(each -> Collections.frequency(nums, each) > 1);
        // NOTE: We can use  Collections.frequency(uniqueList, each) > 1 INSTEAD OF Collections.frequency(nums, each) > 1). Looks like it is removing all matched ones.


        return uniqueList;
    }

    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(23, 54, 234, 65, 34, 23,34));
        System.out.println("Original: " + nums);

        System.out.println("Unique: " + uniqueList(nums));

    }
}

package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveBadPairs {
    public static ArrayList<Integer> keepGoodPair (ArrayList <Integer> list) {

        ArrayList <Integer> goodPair = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) <= list.get(i+1)) {
                goodPair.add(list.get(i));
                goodPair.add(list.get(i+1));
            }

        }

        return goodPair;
    }
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(30, 5, 2, 64, 23, 23, 230, 64));
        System.out.println("Original: " + nums);

        System.out.println("Good Pairs:" + keepGoodPair(nums));

        ArrayList <Integer> nums2 = new ArrayList<>(Arrays.asList( 3, 5, 2, 64, 23, 23 ,23, 64));
//        Option 1 - This for each loop will give an exception because it is looking to loop through all the elements when the loops started
//        ConcurrentModificationException
//        for ( Integer each : nums2) {
//            if (each < 10){
//                nums2.remove(each);
//            }
//        }
//        System.out.println(nums2);

//        Option 2 - This fori loop with remove will skip some elements since size changes and index is keep going on
//        for (int i = 0; i < nums2.size(); i++) {
//            if (nums2.get(i) < 10){
//                nums2.remove(nums2.get(i));
//            }
//        }
//        System.out.println(nums2);
    }
}

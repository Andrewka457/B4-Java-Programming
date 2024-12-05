package day22_arrays;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {23, 34, 2, 65, -56, 3};

        System.out.println(Arrays.toString(nums));

        int [] sortedNums = nums;
        System.out.println(Arrays.toString(sortedNums));

        System.out.println();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortedNums));

        System.out.println();

        int [] nums2 = new int[nums.length];
        System.out.println(Arrays.toString(nums2));

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums [i];
        }
        System.out.println(Arrays.toString(nums2));

    }
}

package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 9};

        String result = "[";

        for (int i = arr.length - 1; i >= 0; i--) {

            result += arr[i] + ", ";

        }

        result = result.substring(0, result.length()-2) + "]";

        System.out.println(result);

        System.out.println();

        int [] reversed = new int[arr.length];
//        int num = arr.length-1;

        for (int i = 0; i < arr.length; i++) {

            reversed [i] = arr[arr.length - i -1];

        }

        System.out.println(Arrays.toString(reversed));

        System.out.println();

        for (int j = 0, i = arr.length - 1; i >= 0 ; i--, j++) {
            reversed [j] = arr[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}

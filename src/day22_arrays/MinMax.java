package day22_arrays;

public class MinMax {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        for (int each : nums) {

            if (each > max) {
                max = each;
            }
            if (each < min){
                min = each;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}

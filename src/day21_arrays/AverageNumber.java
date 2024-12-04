package day21_arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int [] nums = {10, 15, 7, 3};
        double average = nums[0];
        for (int i = 1; i < nums.length; i++) {

            average += nums[i];

        }

        average /= nums.length;
        System.out.println(average);

        average = 0;

        for (int each : nums) {

            average += each;

        }

        average /= nums.length;

        System.out.println(average);

    }
}

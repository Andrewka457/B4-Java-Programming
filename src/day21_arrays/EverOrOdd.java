package day21_arrays;

public class EverOrOdd {
    public static void main(String[] args) {

        int [] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
        String  evenNums = "Even Numbers: ";
        String oddNums = "Odd Numbers: ";

//            for ( int each : nums){
//
//            if (each % 2 == 0) {
//                countEven++;
//                System.out.println("Even: " + countEven);
//                System.out.println("Even Nums: " + each);
//            } else {
//                countOdd++;
//                System.out.println("Odd: " + countOdd);
//                System.out.println("Odd Nums: " + each);
//            }
//        }

        for (int each : nums) {

            if (each % 2 == 0) {
                even++;
                evenNums += each + " ";
            } else {
                odd++;
                oddNums += each + " ";
            }

        }

        System.out.println("Even: " + even);
        System.out.println(evenNums);
        System.out.println("Odd: " + odd);
        System.out.println(oddNums);

    }
}

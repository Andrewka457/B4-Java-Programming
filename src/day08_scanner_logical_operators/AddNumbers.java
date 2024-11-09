package day08_scanner_logical_operators;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);

        int total = num1 + num2 + num3;

        System.out.println("Total: " + total);

        int afterVisionBy2 = total /2;
        System.out.println("After divided by 2: " + afterVisionBy2);

        System.out.println("After added 2: " + (afterVisionBy2 + 2));


    }
}

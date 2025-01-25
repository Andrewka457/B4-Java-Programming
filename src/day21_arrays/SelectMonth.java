package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int monthNum;
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};




        do {

            System.out.print("Enter a number of a month: ");
            monthNum = key.nextInt();

        } while (monthNum < 1 || monthNum > 12);

        System.out.println(months[monthNum - 1]);

    }
}

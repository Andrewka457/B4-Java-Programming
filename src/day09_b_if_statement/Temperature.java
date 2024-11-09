package day09_b_if_statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        int temp = key.nextInt();

        if (temp >= 70){
            System.out.println("It is a nice day\n\t\tGo outside");
        } else {
            System.out.println("It is too cold");
        }

    }
}

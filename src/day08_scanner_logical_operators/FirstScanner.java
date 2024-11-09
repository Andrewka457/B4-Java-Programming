package day08_scanner_logical_operators;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        //Scanner input; input is the object reference name

        // Declaring and instantiating Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        //int userAge = 30;
        int userAge = input.nextInt();
        System.out.println("I am " + userAge + " years old");


    }

}

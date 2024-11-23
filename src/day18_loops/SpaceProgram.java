package day18_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a sentance: ");
        String str = key.nextLine();

//        String str = "java is cool language";
        String str2 = "";

        str = str.replaceAll(" ", "_");

        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i) + " ";
        }

        System.out.println(str2);
    }
}

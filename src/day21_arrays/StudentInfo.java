package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        String [] student1 = {"ID#B#4#1", "Tom", "Jerry", "B#4"};
        System.out.println(Arrays.toString(student1));

        System.out.println();

        String [] student2 = new String[4];

        student2 [1] = "Winny";
        student2 [0] = "ID#B#4#2";
        System.out.println(Arrays.toString(student2));
        student2 [2] = "Pooh";
        student2 [3] = "B#4";
        System.out.println(Arrays.toString(student2));

        System.out.println();

        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);
        System.out.print("Enter ID: ");
        student3 [0] = key.nextLine();
        System.out.print("Enter first name: ");
        student3 [1] = key.nextLine();
        System.out.print("Enter last name: ");
        student3 [2] = key.nextLine();
        System.out.print("Enter batch number: ");
        student3 [3] = key.nextLine();

        System.out.println(Arrays.toString(student3));

        System.out.println();

        String [] questions = {"Enter ID: ", "Enter first name: ", "Enter last name: ", "Enter batch number: "};
        String [] student4 = new String[4];

        for (int i = 0; i < 4; i++) {

            System.out.println(questions[i]);
            student4 [i] = key.nextLine();

        }

        System.out.println(Arrays.toString(student4));

        /*
        TODO: Ask a user how many student info will be entered
                After getting info for each. Print them.
         */


    }
}

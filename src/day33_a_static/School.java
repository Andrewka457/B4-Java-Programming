package day33_a_static;

import java.util.Arrays;
import static day33_a_static.LoopcampStudent.*;

public class School {
    public static void main(String[] args) {

        LoopcampStudent student1 = new LoopcampStudent("Nargiz", "Group 2", "Diana");
        LoopcampStudent student2 = new LoopcampStudent("Roma", "Group 1", "Iryna");


        System.out.println();
        System.out.println(student1);
        System.out.println(student2);

        System.out.println();
        System.out.println(Arrays.toString(LoopcampStudent.teachers)  );

        System.out.println();
        for ( String each : LoopcampStudent.teachers) {
            System.out.println(each);
        }

        printStaticInfo();

    }
}
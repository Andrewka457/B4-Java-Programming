package day33_a_static;

import java.util.Arrays;

public class LoopcampStudent {

    String name;
    String groupNumber;
    String mentor;

    static int batchNumber;
    static int courseLengthInMonth;
    static String schoolName;
    static String [] teachers;

    static {
        batchNumber = 4;
        courseLengthInMonth = 6;
        schoolName = "Loopcamp";
        teachers = new String[] {"Feyruz", "Nadir"};
        printStaticInfo();
    }

    public LoopcampStudent(String name, String groupNumber, String mentor) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.mentor = mentor;
    }

    public static void printStaticInfo () {
        System.out.println("School Info: ");
        System.out.println("\tSchool Name: " + schoolName);
        System.out.println("\tBatch Number: " + batchNumber);
        System.out.println("\tCourse Length in months: " + courseLengthInMonth);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        // System.out.println(mentor);
    }


    @Override
    public String toString() {
        return "LoopcampStudent Info: " +
                "\t\tName: " + name +
                "\t\t\t\tGroup Number: " + groupNumber +
                "\t\t\tMentor Name: " + mentor;
    }

}

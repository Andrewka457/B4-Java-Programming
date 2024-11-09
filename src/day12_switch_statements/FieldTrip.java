package day12_switch_statements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        int grade;
        String teacher;
        String location;
        int numOfGroups;

        Scanner key = new Scanner(System.in);
        System.out.print("What is the grade you want to get a field trip info: ");
        grade = key.nextInt();

        if (grade >= 1 && grade <= 6) {
            if (grade == 1) {
                teacher = "Mrs.Jessica";
                location = "Zoo";
                numOfGroups = 4;
            } else if (grade == 2) {
                teacher = "Mrs.Casey";
                location = "Movie Theatre";
                numOfGroups = 5;
            } else if (grade == 3) {
                teacher = "Mr.Tom";
                location = "Museum";
                numOfGroups = 7;
            } else if (grade == 4) {
                    teacher = "Mr.Jerry";
                    location = "Aquarium";
                    numOfGroups = 9;
            } else if (grade == 5) {
                teacher = "Mr.Winnie";
                location = "Disnayland";
                numOfGroups = 2;
            } else {
                teacher = "Mr.Pooh";
                location = "Concert";
                numOfGroups = 3;
            }
        } else {
            teacher = "N/A";
            location = "N/A";
            numOfGroups = 0;
        }

        System.out.println("Here is field trip info for grade " + grade);
        System.out.println("Teacher Name: " + teacher);
        System.out.println("Location: " + location);
        System.out.println("Number of groups: " + numOfGroups);

    }
}

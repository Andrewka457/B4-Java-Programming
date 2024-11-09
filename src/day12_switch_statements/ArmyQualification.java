package day12_switch_statements;

import java.util.Scanner;

public class ArmyQualification {
    public static void main(String[] args) {

        boolean isCitizen, isResident, hasDiploma;
        int age;

        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to Army Station");
        System.out.println("Answer the following question to check eligibility\n");
        System.out.print("\tAre you a citisen (true/false): ");
        isCitizen = key.nextBoolean();
        System.out.print("\tAre you a resident (true/false): ");
        isResident = key.nextBoolean();
        System.out.print("\tDo you have a high school diploma (true/false): ");
        hasDiploma = key.nextBoolean();
        System.out.print("\tHow old are you: ");
        age = key.nextInt();

        if ((isCitizen || isResident) && 35 >= age && age >= 18 && hasDiploma) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible for the following reasons:");
            if (!isCitizen || !isResident){
                System.out.println("\tYou must be a citizen or resident");
            }
            if (!hasDiploma) {
                System.out.println("\tYou must have a high school diploma");
            }
            if (18 > age || age > 35){
                System.out.println("\tYour age must be between 18 to 35 years");
            }
        }


    }
}

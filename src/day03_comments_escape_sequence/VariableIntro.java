package day03_comments_escape_sequence;

public class VariableIntro {
    public static void main(String[] args) {

        // Option 1
        int num1; // Declaration
        num1 = 6; // Assignment

        System.out.println(4);
        System.out.println(num1);

        num1 = 10; // re-assignment
        System.out.println(num1);

        // Option 2
        int num2 = 30; // Declaration and assignment in the same statement
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2 = 40;
        System.out.println(num2+num1);

    }
}

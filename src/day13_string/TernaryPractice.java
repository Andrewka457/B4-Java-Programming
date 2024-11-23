package day13_string;

public class TernaryPractice {
    public static void main(String[] args) {

        int num = 45;

        if (num < 10 && num >= -9) {
            System.out.println("Number is single digit");
        } else {
            System.out.println("Number is multi digit");
        }

        System.out.println("----------------------------------------------");

        System.out.println((num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit");

    }
}

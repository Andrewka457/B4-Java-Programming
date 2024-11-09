package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter 3 angles(in decimals): ");
        System.out.print("1st angle: ");
        double ang1 = key.nextDouble();
        System.out.print("2nd angle: ");
        double ang2 = key.nextDouble();
        System.out.print("3rd angle: ");
        double ang3 = key.nextDouble();

        boolean isTriangle, isCircle;

        isTriangle = ang1 + ang2 + ang3 == 180;
        isCircle = ang1 + ang2 + ang3 == 360;

        System.out.println("It is triangle: " + isTriangle);
        System.out.println("It is circle: " + isCircle);

    }
}

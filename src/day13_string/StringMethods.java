package day13_string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

//        Scanner key = new Scanner(System.in);
//        key.nextLine();

        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");


        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false

        System.out.println("------------------------------");

        System.out.println(name1.equals(name2)); // this will compare String VALUE taking into consideration case sensitiveness
        System.out.println(name2.equals(name3));
        System.out.println(name1.equals(name3));
        System.out.println("Micky".equals(name1));
        System.out.println(name1.equals("Micky"));
        System.out.println(new String("Micky").equals(name1));
        System.out.println(name1.equals(new String("Micky")));
        System.out.println("Micky".equals(new String("Micky")));

        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals(str2));

        String str3 = "Micky";
        String str4 = "MICKY";
        System.out.println(str3.equals(str4));


        System.out.println(str3.equalsIgnoreCase(str4)); // this will compare String VALUE ignoring case sensitiveness


        String school = "loopcamp";
        System.out.println(school);
        System.out.println(school.length());
        int numOfChars = school.length();
        System.out.println(numOfChars);

        System.out.println(str2.length());



    }
}

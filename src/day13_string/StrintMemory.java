package day13_string;

import java.util.Scanner;

public class StrintMemory {
    public static void main(String[] args) {

        // datatype (non-primitive / object Type)
        // ClassName ObjectReferenceName
        Scanner key;
        String word;

        // datatype (primitive) variableName
        int num;

        //--------------------------------------------------------
        // There are 2 options that you can create a String

        // Option 1 - By literals - simply by double quotes
        String str1 = "java";

        // Option 2 - By new Keyword - new String ("");
        String str2 = new String("java");

        String str3 = "java";

        String str4 = new String("java");


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("-----------------------------------------------------------------");

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);

        String str5 = "Java";
        System.out.println(str1 == str5);

        // == - with this relational operator, we compare the memory location not the value itself
    }
}

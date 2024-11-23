package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {


        String str = "new word";

        System.out.println(str.isEmpty());
        System.out.println(str.length());

        str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.length());

        str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.length());

        System.out.println(str.length() == 0 ? "There is not character" : "There are some characters");

        System.out.println("---------------------------------------");

        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        str = "Java is fun";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        str = "    ";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

    }
}

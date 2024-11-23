package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String str = "penpen";

        char firstChar = str.charAt(0);
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf(firstChar));

        System.out.println("--------------------");

        System.out.println(str.indexOf("pe"));
        System.out.println(str.indexOf("np"));

        System.out.println("---------------------------------------");

        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("pen"));

        System.out.println("-----------------------------------");

        System.out.println(str.indexOf("pen"));

        System.out.println("-------------------------------");

        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("Pen"));
        System.out.println(str.indexOf("PEN"));

        System.out.println("-------------------------------");

        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf('e', 2));

    }
}

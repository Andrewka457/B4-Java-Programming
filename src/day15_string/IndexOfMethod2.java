package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String str = "java";

        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf("a"));

        System.out.println("------------------------");

        String str2 = "kjnfacvkjdacfkjvnacdfkjvl";

        System.out.println(str2.indexOf("ac"));
        System.out.println(str2.lastIndexOf("ac"));

        System.out.println("------------------------------");

        System.out.println(str2.indexOf("ac", 4));
        System.out.println(str2.lastIndexOf("ac", 4));


    }
}

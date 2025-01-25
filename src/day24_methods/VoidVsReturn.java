package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        sayHi();
//        String str = sayHi();
        String str = sayHi2();

        System.out.println(str);

    }

    public static void sayHi () {
        System.out.println("Hi");
    }

    public static String sayHi2 () {
        String str = "Hi";
         return str;
    }

}

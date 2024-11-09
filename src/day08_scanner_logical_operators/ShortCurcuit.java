package day08_scanner_logical_operators;

public class ShortCurcuit {
    public static void main(String[] args) {

        int i = 10;

        System.out.println(false && ++i > 5);
        System.out.println(i);

        System.out.println("------------------");

        int y = 10;
        System.out.println(false & ++y > 5);

        System.out.println(y);

        System.out.println("------------------");

        int x = 10;

        System.out.println(true && ++x > 5);

        System.out.println(x);

    }
}

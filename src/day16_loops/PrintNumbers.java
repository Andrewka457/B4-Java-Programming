package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hi!");
        }

        int num = 2;

        while (num <= 100) {
            num += 2;
            System.out.println(num);
        }

        System.out.println();
        System.out.println(num);

        System.out.println("--------------------------------");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i++);
            } else {
                i++;
            }

        }

    }
}

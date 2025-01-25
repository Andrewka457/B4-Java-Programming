package day24_methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name = "Jerry";
        sayHello();
        sayHello2("Micky");
        sayHello2("Jim");
        sayHello2(name);
        String str = "James";
        sayHello2(str);

        Scanner key = new Scanner(System.in);
        System.out.print("What is your name: ");
        String userName = key.nextLine();
        sayHello2(userName);

    }

    public static void sayHello () {

        String name = "Tom";
        System.out.println("Hello " + name + "! How are you?");
    }

    public static void sayHello2 (String name) {

        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello " + name + "! How are you?");
    }
}

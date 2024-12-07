package day24_methods;

public class MyFirstMethod {



    public static void printHelloWorld (){
        System.out.println("Hello World!");
    }


    public static void printHelloWorld50 () {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World!");
        }
    }



    public static void main(String[] args) {

        System.out.println("Hello World!");

        printHelloWorld();  // I called a method named printHelloWorld()
        printHelloWorld();
        printHelloWorld();

        System.out.println("Bye");

        printHelloWorld50();
        System.out.println("-----------");
        printHelloWorld50();
    }





}
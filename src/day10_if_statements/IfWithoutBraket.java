package day10_if_statements;

public class IfWithoutBraket {
    public static void main(String[] args) {

        if (5 > 1) {
            System.out.println("Hi-1");
            System.out.println("Bye-1");
        }


        // If without brackets --- you can only one statement
        if (5 > 1) System.out.println("Hi-2");

        System.out.println("---------------------------");

        if (4 > 2){
            System.out.println("loop-1");
        } else {
            System.out.println("loop-2");//this is belonging to else
            System.out.println("loop-3");//this is stand alone statement
        }

        if (5 > 0)
            System.out.println("camp-1");
        else
            System.out.println("camp-2");


    }
}

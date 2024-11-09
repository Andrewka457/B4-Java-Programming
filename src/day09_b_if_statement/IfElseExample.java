package day09_b_if_statement;

public class IfElseExample {
    public static void main(String[] args) {

        int score = 75;

        if (score >= 75){

            System.out.println("You pass the exam");
        }

        if (score < 75){
            System.out.println("You fail the exam");
        }

        System.out.println("--------------------------------------");

        if (score >= 75){
            System.out.println("You pass the exam");
        } else {
            System.out.println("You fail the exam");
        }



    }
}

package day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {

        int num = 6;

        if (num >= 1 && num <= 5){
            if (num == 1) {
                System.out.println("One");
            } else if (num == 2) {
                System.out.println("Two");
            } else if (num == 3) {
                System.out.println("Three");
            } else if (num == 4) {
                System.out.println("Four");
            } else {
                System.out.println("Five");
            }
        } else {
            System.out.println("It is not in the range 1-5");
        }


        switch (num) { // String, char, int, short, byte
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("It is not in the range 1-5");
        } // If you do not put "break;" -- >  execution goes from matching case all the way until the first "break" or all the way to the end

    }
}

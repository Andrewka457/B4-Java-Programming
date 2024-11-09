package day11_if_statements;

public class Ternary {
    public static void main(String[] args) {

        int a = 70;
        String result;

        if (a % 2 == 0){
            result = "Even number";
        }else {
            result = "Odd number";
        }
        System.out.println(result);

        // OPTION 2 - with ternary
        // CONDITION ? value1 : value2
        //      - value1 --- > if condition is TRUE
        //      - value2 --- > if condition is FALSE
        result = (a % 2 == 0) ? "Even number" : "Odd number";
        // if you are assigning the result of TERNARY into a variable, the data type has to MATCH.
        System.out.println(result);

        // ON the following two print statements, since the result of the ternary is NOT assigned to any variable, I can use different data type values in Ternary
        System.out.println(  (a % 2 == 0) ? "Even Number from Ternary" : 34  );
        System.out.println(  (a % 2 == 0) ? "Even Number from Ternary" : true  );


        System.out.println("-------------------------");
        int num;

        // num = (4 > 2 && 4 < 20) ? 45 : "65"; // values data type has to be same as variable data type
        num = (4 > 2 && 4 < 20) ? 45 : 65;
        System.out.println(num); //



        System.out.println("-------------------------");

        int n = 50;
        System.out.println(50 > 0 ? "Positive" : "Negative");

        String str = 50 < 0 ? "+" : "-";
        System.out.println(str);


    }
}

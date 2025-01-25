package day24_methods;

public class AverageOfEach {
    public static void main(String[] args) {

        int [] [] numbers = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double sumTotal = 0;

        for (int [] each : numbers) {
            double sum = 0;

            for (int  each2 : each){

                sum += each2;
//                System.out.println(each2);


            }

            sumTotal += sum / each.length;

            System.out.println(sum / each.length);
        }

        System.out.println(sumTotal/numbers.length);
    }
}

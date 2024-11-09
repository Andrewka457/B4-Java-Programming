package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 10.99;
        boolean hasPrimeMembership = true;

        if (hasPrimeMembership) {
            System.out.println("Eligible for 2 days shipping");
        } else {
            if  (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
            }
        }


        if (hasPrimeMembership) {
            System.out.println("Eligible for 2 days shipping");
        } else if (!hasPrimeMembership && price >= 25) {
            System.out.println("Eligible for regular free shipping");
        } else if (!hasPrimeMembership && price < 25 ) {
            System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
        }

    }
}

package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        double giftCard =200;
        double item1 = 10;
        double item2 = 25.9;

        System.out.println("I hahe $"+ giftCard + " Balance in my card.");
        System.out.println("I bought a cup for $" + item1);

        giftCard -= item1;
        System.out.println("After purchasing the cup, I have $" + giftCard + " balance");
        //System.out.println("After purchasing the cup, I have $" + (giftCard -= item1));

        System.out.println("I bought a T-Shirt for $" + item2);
        System.out.println("After purchasing the cup, I have $" + (giftCard -= item2) + " balance");


    }
}

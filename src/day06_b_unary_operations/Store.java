package day06_b_unary_operations;

public class Store {
    public static void main(String[] args) {

        String store = "Costko";
        int numberOfTV = 100;

        System.out.println("Someone came into the store and they bought a TV");
       // numberOfTV = numberOfTV - 1;
        //System.out.println("Number of TV in stock: " + numberOfTV);
        System.out.println("Number of TV in stock: " + --numberOfTV);

        System.out.println("Another one bought the same TV");
        System.out.println("Number of TV in stock: " + --numberOfTV);
        System.out.println("Someone else came into the store and out the into the Shopping Cart but have not paid yet");
        System.out.println("Number of TV ins stock (in computer): " + numberOfTV--);
        System.out.println("Person actually now paid for it.");
        System.out.println("Number of TV ins stock (in computer): " + numberOfTV);
        System.out.println("More of the same TV came into stock");
        numberOfTV = numberOfTV + 15;
        System.out.println("Num of TV in stock: " + numberOfTV);


    }
}

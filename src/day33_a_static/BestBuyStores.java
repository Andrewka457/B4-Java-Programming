package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy store1 = new BestBuy("Arlington, VA");
        BestBuy store2 = new BestBuy("Paramus, NJ");
        BestBuy store3 = new BestBuy("Orlando, FL");

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println(BestBuy.headquarter);

        BestBuy.headquarter = "900 Test St South, Richfield, Alaska";

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        System.out.println();
        store1.headquarter = "100 Check Dr south, Richfield, Virginia";

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);
        System.out.println(BestBuy.headquarter);

        System.out.println();

        System.out.println(store1.specialDay);
        System.out.println(store3.specialDay);
        System.out.println(BestBuy.specialDay);

        System.out.println("-------------------------------------------------");

        store1.openStore();
        store2.openStore();
        store3.openStore();

        System.out.println("-------------------------------------------------");


        BestBuy.specialDaySale();
        store1.specialDaySale();
        store2.specialDaySale();
        store3.specialDaySale();


    }
}

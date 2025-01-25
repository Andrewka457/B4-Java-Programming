package day25_methods;

/*
    1 dollar = 0.95 euro
    1 dollar = 150.0 yene
    1 dollar = 34.88 lira
    1 dollar = 1,423.00 won
    1 dollar = 84.86 rupee
 */

public class CurrencyConverter {
    public static void main(String[] args) {

        double result = convertCurrency("euro", 100);
        System.out.println(  convertCurrency("euro", 100)  );
        System.out.println(  convertCurrency("won", 100)  );
        System.out.println(  convertCurrency("Euro", 100)  );
        System.out.println(  convertCurrency("Gel", 100)  );


    }

    public static double convertCurrency (String currencyName, double dollarAmount){

        double result = 0.0;
        switch (currencyName.toLowerCase()){
            case "euro":
                result = dollarAmount * 0.95;
                break;
            case "yene":
                result = dollarAmount * 150;
                break;
            case "lira":
                result = dollarAmount * 34.88;
                break;
            case "won":
                result = dollarAmount * 1423.00;
                break;
            case "rupee":
                result = dollarAmount * 84.86;
                break;
            default:
                System.out.println("Not valid currency!");
                result = -1;
        }

        return result;
    }


}

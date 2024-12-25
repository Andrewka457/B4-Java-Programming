package day31_custom_classes;

public class Coffee {
    // Instance variables - each obj has its own copy of these
    double price;
    double sizeInOz;
    String brand;
    String type;



    public void drink () {
        System.out.println( "Drinking " + type + " type of coffee" );
    }

    public void refill (double addOz ) {
        System.out.println("Refilling " + addOz + " oz.");
        sizeInOz += addOz;
    }



    public String toString() {
        return  "Coffee: " +
                "\n\tprice: $" + price +
                "\n\tsize in OZ: " + sizeInOz +
                "\n\tbrand: " + brand +
                "\n\ttype: " + type;
    }
}

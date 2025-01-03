package day33_a_static;

public class Iphone {

    String model;
    double price;

    static String company;
    static String os;
    static String appleDay;

    public Iphone (String model, double price) {

        this.model = model;
        this.price = price;

    }

    static {
        System.out.println("Static block run:");
        company = "Apple";
        os = "IOS";
        appleDay = "November 30th";
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}' +
                " -- " +
                "Company: " + company +
                ", OS: " + os +
                ", Apple Day: " + appleDay;
    }
}

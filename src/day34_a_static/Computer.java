package day34_a_static;

public class Computer {

    String brand;
    String color;
    double price;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Computer class loaded");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String  toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasScreen=" + hasScreen +
                ", hasBattery=" + hasBattery +
                ", hasMemory=" + hasMemory +
                '}';
    }
}

package day34_a_static;

public class CompLab {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Dell", "Black", 999.90);
        System.out.println(comp1);

        Computer comp2 = new Computer("Hp", "Silver", 599.90);
        System.out.println(comp2);

        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);

        System.out.println(comp1.hasScreen);
        System.out.println(comp2.hasScreen);

        comp1.price = 299.90;

        System.out.println(comp1.price);
        System.out.println(comp2.price);

        System.out.println(comp1);
        System.out.println(comp2);

        System.out.println();

        comp1.hasScreen = true;

        System.out.println(comp1.hasScreen);
        System.out.println(comp2.hasScreen);

        System.out.println(comp1);
        System.out.println(comp2);

    }
}

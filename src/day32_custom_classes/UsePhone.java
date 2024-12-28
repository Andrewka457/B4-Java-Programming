package day32_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

//        Phone phone1 = new Phone();
//
//        phone1.name = "Iphone 16 Pro";
//        phone1.brand = "Apple";
//        phone1.memory = 128;
//        phone1.version = 18.2;

        Phone phone1 = new Phone("Iphone 16 Pro", "Apple", 128, 18.2);

        System.out.println(phone1);

        System.out.println();

        Phone phone2 = new Phone("Iphone 12 mini");

        System.out.println(phone2);

        System.out.println();

        Phone phone3 = new Phone("Iphone 16 Pro Max", "Apple", 512);

        System.out.println(phone3);

        System.out.println();

        Phone phone4 = new Phone("Iphone 14 Pro", "Apple", 512, 16.0);

        System.out.println(phone4);

    }
}

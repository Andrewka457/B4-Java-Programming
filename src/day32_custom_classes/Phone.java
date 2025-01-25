package day32_custom_classes;

public class Phone {

    String name ;
    String brand;
    int memory;
    double version;

//    public Phone (){
//
//    }

    public Phone (String name, String brand, int memory, double version) {

        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;

    }

    public Phone (String name) {

        this.name = name;

    }

    public Phone (String name, String brand, int memory) {

        this.name = name;
        this.brand = brand;
        this.memory = memory;

    }

    public String toString() {


        String msg = "";

        if (name != null) {
            msg += "\n\tName: " + name;
        } else {
            msg += "\n\tName: Info not available";
        }

        if (brand != null) {
            msg += "\n\tBrand: " + brand;
        } else {
            msg += "\n\tBrand: Info not available";
        }

        if (memory != 0) {
            msg += "\n\tMemory: " + memory;
        } else {
            msg += "\n\tMemory: Info not available";
        }

        if (version != 0.0) {
            msg += "\n\tVersion: " + version;
        } else {
            msg += "\n\tVersion: Info not available";
        }

//        String msg = "Phone Info: " +
//                "\n\tName: " + (name != null) ? name : "Info not available" +
//                "\n\tBrand: " + brand +
//                "\n\tMemory: " + memory +
//                "\n\tVersion: " + version;

        return msg;

//        return "Phone Info: " +
//                "\n\tName: " + name +
//                "\n\tBrand: " + brand +
//                "\n\tMemory: " + memory +
//                "\n\tVersion: " + version;
    }
}

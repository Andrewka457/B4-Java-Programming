package day24_methods;

public class Car {

    public static void unlockCar () {
        System.out.println("Unlocking the car.");
    }

    public static void openDoor () {
        System.out.println("Opening the door.");
    }

    public static void getInCar () {
        System.out.println("Sitting in the car.");
        System.out.println("Closing the door.");
    }

    public static void getReady (){
        System.out.println("Put the seatbelt on.");
        System.out.println("Check the mirrors.");
        System.out.println("Turn the music on.");
        System.out.println("Lower the windows.");
        System.out.println("Put on navigation.");
    }

    public static void startCar () {
        System.out.println("Star the Engine.");
    }

    public static void drive () {
        System.out.println("Switch the gear into D");
        System.out.println("Dive and go.");
    }

    public static void driveInRush () {
        unlockCar();
        getInCar();
        startCar();
        drive();
    }

    public static void main(String[] args) {
        unlockCar(); // Calling .unlockCar() method
        openDoor();  // Calling .openDoor() method

        getInCar();
        // putSeatBelt(); // Cannot call a method which does NOT exist
        getReady();
        startCar();
        drive();

        System.out.println("------------------");
        driveInRush(); // Calling driveInRush() method which calls multiple other methods.

    }
}

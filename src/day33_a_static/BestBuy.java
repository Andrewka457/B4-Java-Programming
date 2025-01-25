package day33_a_static;

public class BestBuy {

    String location;
    static String headquarter = "Richfield, MI";
    static String specialDay = "28th Dec";

    public BestBuy (String location) {
        this.location = location;
    }

    public void openStore () {
        System.out.println("Opening the store in location: " + location);
    }

    public static void specialDaySale () {
        System.out.println("There %40-%70 discount on " + specialDay);
    }

    /**
     * static
     *      - all objects share/have the ONE/SAME copy
     *      - if it changes/updated, all objects are affected
     *      - We use class name to reach the static members
     *          - Possible to used the object reference as well but not good approach
     *      - Static ONLY accepts static members
     *      - we cannot use 'this' keyword
     *
     *
     * instance
     *      - every object has its OWN copy
     *      - if instance for one object is changed/updated, it only affects that object
     *      - We use object reference to reach instance members
     *          - NOT possible to use the Class Name to reach the instance members
     *      - Instance accepts BOTH static and instance members
     */

}

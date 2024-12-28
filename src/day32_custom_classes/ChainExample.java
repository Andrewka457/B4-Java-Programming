package day32_custom_classes;

public class ChainExample {

    public ChainExample () {
        System.out.println("First");
    }

    public ChainExample (int i) {
        this();
        System.out.println("Second");
    }

    public ChainExample (String str) {
        this(4);
        System.out.println("Third");
    }

    public  ChainExample (double d) {
        this();
        System.out.println("Fourth");
    }

    /**
     *  RULES for Constructor Chaining
     *      1 - this() should always be the FIRST LINE
     *      2 - Only ONE constructor can be called in the SAME constructor
     *      3 - Constructor should not call itself
     *      4 - Constructor should not contain itself in the chaining with multiple constructors
     *      5 - Constructor that is called can NOT call the one which called it
     */

}

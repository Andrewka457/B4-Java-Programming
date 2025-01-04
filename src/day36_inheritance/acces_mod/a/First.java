package day36_inheritance.acces_mod.a;

public class First {

    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;

    public static void main(String[] args) {

        First f = new First();
        System.out.println(f.one);
        System.out.println(f.two);
        System.out.println(f.three);
        System.out.println(f.four);



    }

}

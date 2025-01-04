package day36_inheritance.acces_mod.b;

import day36_inheritance.acces_mod.a.First;

public class Third extends First {

    public static void main(String[] args) {

        First f = new First();
        System.out.println(f.one);
//        System.out.println(f.two);
//        System.out.println(f.three);
//        System.out.println(f.four);


        Third t = new Third();
        System.out.println(t.one);
        System.out.println(t.two);
//        System.out.println(t.three);
//        System.out.println(t.four);


    }

}

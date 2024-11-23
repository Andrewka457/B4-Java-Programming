package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String str = "loop";

        char firstCharInStr = str.charAt(0);
        String firstCharInStr2 = "" + str.charAt(0);

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        String str2 = "hdnvkbndzlkjbvksvndfkkj lhvnndvhjgevhvbf yueguvnkjdhdsfvdfvgg";
        System.out.println(str2.length());

        System.out.println(str2.length() -1 );
        System.out.println(str2.charAt(str2.length() -1 ));

        System.out.println(str2.charAt(str2.length() - 2));

        System.out.println();
        System.out.println("Number of characters in str2: " + str2.length());
        System.out.println("First character in str2: " + str2.charAt( 0 ));
        System.out.println("Last character in str2: " + str2.charAt( str2.length() - 1 ) );

        System.out.println();
        String str3 = "loop - camp";
        System.out.println(str3.length());
        System.out.println(str3.charAt(4));


    }
}

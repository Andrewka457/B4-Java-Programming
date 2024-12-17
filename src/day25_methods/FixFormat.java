package day25_methods;

import my_utilities.StringUtil;

public class FixFormat {
    public static void main(String[] args) {

        fixFormat("MICKY");  // Micky
        System.out.println( fixFormat("MOUse") );

        String name = "TOM";
        String fixedName = fixFormat(name);
        System.out.println( fixedName );

        System.out.println(StringUtil.fixFormat("MOUse"));

    }


    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;

    }
}

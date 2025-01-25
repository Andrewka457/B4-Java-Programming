package day28_arraylist;


public class HtmlGenerator {
    public static void main(String[] args) {
        String str = "li^3";

        System.out.println( htmlGenerator(str) );
        System.out.println( htmlGenerator("div^7") );
        System.out.println( htmlGenerator("span^2") );

    }




    public static String htmlGenerator (String str) {

        String result = "";
        String [] arr = str.replace("^", " ").split(" "); // ["li", "3"]


        int numOfCycle = Integer.parseInt(arr[1]); // "3" -- > 3

        for (int i = 0; i < numOfCycle; i++) {  // 0 < "3";
            result += "<" + arr [0] + "></" + arr[0] + ">";        // <li></li>
        }

        return result;
    }

}
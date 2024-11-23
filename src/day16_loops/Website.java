package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = key.next();

        if (url.startsWith("www.") && url.endsWith(".com")) {
            url = url.substring(url.indexOf(".") + 1, url.lastIndexOf("."));
            System.out.println(url);
        } else {
            System.out.println("URL is not valid");
        }

    }
}

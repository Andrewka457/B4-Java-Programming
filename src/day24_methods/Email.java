package day24_methods;

public class Email {
    public static void main(String[] args) {

        String fullName = "Tom Jerry";
        String domain = "gmail.com";

//        fullName.substring(0,1) + fullName.substring(fullName.indexOf(' ') + 1) + "@" + domain

        buildEmail(fullName, domain);
        buildEmail("Micky Mouse", "outlook.com");

    }

    public static void buildEmail (String fullName, String domain){

        String result = (fullName.substring(0, 1) + fullName.substring(fullName.indexOf(' ') + 1) + "@" + domain).toLowerCase();

        System.out.println(result);

    }

    /*
        TODO: Home Practice
                Make sure that user gives you full name with 2 words
                And domain contains "@"
                if does not
                    give message saying the reason why.
     */

}

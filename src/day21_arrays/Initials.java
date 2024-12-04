package day21_arrays;

public class Initials {
    public static void main(String[] args) {

        String [] classmates = {"James Bond", "Eve Rell", "Anna Johnson"};
        String [] initials = new String[classmates.length];

        System.out.println("I have " + classmates.length + " full names.");
        System.out.println();

        for (String each : classmates) {

            each = each.trim();

            String firstName = each.substring(0, each.indexOf(' ')).toUpperCase();
            String lastName = each.substring(each.indexOf(' ') + 1).toUpperCase();

            System.out.println("" + firstName.charAt(0) + lastName.charAt(0));

        }

        /*
            TODO: Home Practice:
                Implement the same code with the use of FORI loop.
         */

    }
}

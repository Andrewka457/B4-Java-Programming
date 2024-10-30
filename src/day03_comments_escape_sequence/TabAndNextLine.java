package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        System.out.println("A Sentence");
        System.out.println(" A Sentence");
        System.out.println("  A Sentence");
        System.out.println("   A Sentence");
        System.out.println("    A Sentence");

        System.out.println("\tA Sentence");
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence");

        System.out.println();

        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println("\n1) Unlock the car door\n2) Get into the car\n3) Start the car");

        System.out.println("\nWeek Days:\n\tMonday\n\tTuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");
    }
}

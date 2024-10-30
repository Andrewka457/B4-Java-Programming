package day04_variables;

public class PrintDate {
    public static void main(String[] args) {
        byte month = 10;
        byte day = 23;
        short year = 2024;

        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "\\" + day + "\\" + year);
        System.out.println(month + "|" + day + "|" + year);
        System.out.println(month + "<>" + day + "<>" + year);
        System.out.println(month + day + year);
    }
}

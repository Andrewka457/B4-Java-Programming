package day32_custom_classes;

public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Tom", "SDET");

        System.out.println(emp1);

        System.out.println();

        Employee emp2 = new Employee("Jerry", 107, "QA", 120_000.0);

        System.out.println(emp2);

        System.out.println();

        emp1.goToMeeting();

        System.out.println();
        emp2.goToMeeting();

    }


}

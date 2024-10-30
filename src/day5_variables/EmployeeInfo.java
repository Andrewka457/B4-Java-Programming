package day5_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName , lastName, companyName, jobTitle;
        char gender, suite;
        int age, numOfPTO;
        boolean isFullTime, isMarried;
        double salary;

        firstName = "Tom";
        lastName = "Jerry";
        companyName = "Loopcamp";
        jobTitle = "SDET";
        age = 30;
        numOfPTO = 21;
        salary = 120_000.00;
        isFullTime = true;
        isMarried = false;
        gender = 'M';
        suite = 'A';

        String fullReport = "Full Report: " +
                            "\n\tFirst Name: " + firstName +
                            "\n\tLast Name: " + lastName +
                            "\n\tCompany Name: " + companyName +
                            "\n\tJob Title: " + jobTitle +
                            "\n\tAge: " + age +
                            "\n\tPTO Amount: " + numOfPTO +
                            "\n\tSalary: $" + salary +
                            "\n\tIs Full Time? " + isFullTime +
                            "\n\tIs Married? " + isMarried +
                            "\n\tGender: " + gender +
                            "\n\tSuite: " + suite;
        System.out.println(fullReport);



    }
}

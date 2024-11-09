package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double baseSalary = 100_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;

        stateTaxAmount = baseSalary * stateTaxRate;
        federalTaxAmount = baseSalary * federalTaxRate;
        totalTaxAmount = stateTaxAmount + federalTaxAmount;
        salaryAfterTax = baseSalary - totalTaxAmount;

        String  taxReport = "Tax Info: \n\tBase Salary : $" + baseSalary + "\n\tState Tax Rate: " + stateTaxRate + "\n\tFederal Tax Rate: " + federalTaxRate + "\n\t--------------------\n\tAfter Tax: $" +salaryAfterTax;

        System.out.println(taxReport);

    }
}

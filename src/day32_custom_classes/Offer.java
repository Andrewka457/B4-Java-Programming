package day32_custom_classes;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int pto;

    public Offer (String company, String location) {

        this.company = company;
        this.location = location;

    }

    public Offer (String company, String location, double salary) {

        this.company = company;
        this.location = location;
        this.salary = salary;

    }

    public Offer(String company, String location, double salary, boolean isFullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.pto = pto;
    }

    public String toString() {

        String result = "Offer Info: ";

        result += "\n\tLocation: " + location;
        result += "\n\tCompany: " + company;

        result += "\n\tSalary: " + ((salary > 0) ? "$" + salary : "Info Not available.");
        result += "\n\tIs Full Time: " + ((isFullTime) ? "Full Time" : "Either Not Full Time or Info Not available.");
        result += "\n\tNumber Of PTO: " + ((pto > 0) ? pto + " days" : "O days as PTO or Info Not available.");

        return result;
    }

}

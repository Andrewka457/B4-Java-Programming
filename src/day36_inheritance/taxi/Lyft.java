package day36_inheritance.taxi;

public class Lyft {

    String driverName;

    public Lyft(String driverName) {
        this.driverName = driverName;
    }

    public double calculateRate(int miles) {
        return miles * 2.5;
    }


}

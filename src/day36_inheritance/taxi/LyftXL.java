package day36_inheritance.taxi;

public class LyftXL extends Lyft{

    public LyftXL(String driverName) {
        super(driverName);
    }

    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles) * 1.2;
//        return miles * 3.5;
    }

}

package day23_multidimensional_arrays;

public class AWS {
    public static void main(String[] args) {

        String applicationName = "loopcamp";
        String zone = "us-east1, us-west1, us-north1, us-south1";

        String [] zoneArr = zone.split(", ");

        for (String each : zoneArr) {
            System.out.println(applicationName + " is deploying on " + each);
        }

        System.out.println();

        for (int i = 0; i < zoneArr.length; i++) {
            System.out.println(applicationName + " is deploying on " + zoneArr[i]);
        }

    }
}

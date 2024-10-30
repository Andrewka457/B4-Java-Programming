package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 3; //IMPLICIT CASTING (WIDENING CONVERSION)
        double num2 = 2;

        double addition = num1 + num2; // 3.0 + 2.0
//        int subtraction = (int)num1 - (int)num2;  // 3 - 2
//        int subtraction2 = (int)(num1 - num2);  // int (3.0 - 2.0)

        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        System.out.println();

        int i1 = 3;
        int i2 = 2;
        int div = i1 / i2;  //1
        double div2 = i1 / i2; //1.0
        System.out.println(div);
        System.out.println(div2);


        num1 = 13;
        num2 = 5;
        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder);



                // MODULE/REMAINER
        int rem = i1 % i2;  // 13 % 5 --- > 3
        double rem2 =  i1 % i2; // 13 % 5 -- > 3 --- > 3.0
        System.out.println(rem); //
        System.out.println(rem2); //

        System.out.println();
        System.out.println("------------");
        System.out.println(3.4 + 1);  // double + int --- > double

        int a = 5;
        double d = 4; // 4.0
        System.out.println(a + d); // 5 + 4.0 -- > int. + double --- >  double


        System.out.println();
        System.out.println("------------");
        byte b = 3;
        short s = 2;
        System.out.println(b * s); // result going to be INT

        byte b1 = 4;
        short s2 = 5;
        // short result = b1 * s2;  // 20 --- > int (because COMPILER takes the whole number as int by default) can NOT be stored into short without casting.
        short result = (short)(b1 * s2);  // 20 --- > int -- > short


        double result2 = b1 + s2;  // byte + short --- > int ---> storing it into double is OK. WIDENING CONVERSION -- > from SMALL to BIG

        int i5 = 4;
        long l5 = i5;
        long result3 = i5 + l5;
        System.out.println(result3);
        System.out.println(result3);




    }
}

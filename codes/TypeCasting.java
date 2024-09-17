import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // type casting
        // int numb = (int) 67.64f;
        // System.out.println(numb);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte) a;
        // System.out.println(b);
        // since we know the max value abyte can have is 256 and when we print this the value is 1 coz
        // remainder of max value to 256, 257 % 256 = 1

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d);
        // here when we multiply a and b we get 2000 but byte can have only 256, java here is promoting byte to integer since it is a intermediate step

        // int number = 'A';
        // System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}

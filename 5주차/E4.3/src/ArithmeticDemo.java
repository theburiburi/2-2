import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        int value1, value2;

        System.out.println("Please enter a first integer");
        value1 = keyIn.nextInt();

        System.out.println("Please enter a second integer");
        value2 = keyIn.nextInt();

        System.out.println(value1 + value2);
        System.out.println(value1 - value2);
        System.out.println(value1 * value2);
        System.out.println((value1 + value2) /2.0);
        System.out.println(Math.abs(value1 - value2));
        System.out.println(Math.max(value1 , value2));
        System.out.println(Math.min(value1 , value2));
    }
}

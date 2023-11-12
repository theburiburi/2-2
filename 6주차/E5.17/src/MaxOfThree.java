import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args){
        Scanner KeyIn = new Scanner(System.in);

        System.out.println("Please enter three numbers:");
        double a = KeyIn.nextDouble();
        double b = KeyIn.nextDouble();
        double c = KeyIn.nextDouble();

        double maximum = Math.max(a, b);
        maximum = Math.max(maximum, c);

        System.out.println("The largest number is " + maximum + ".");
        
    }
}

import java.util.Scanner;

public class DigitPrinter {
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        int num;

        System.out.println("Please enter a 5 digit integer: ");
        num = keyIn.nextInt();
        int a = 10;
        while(num / a >= 10)
        {
            a *= 10;
        }
        
        while(a != 0)
        {
            System.out.print(num/a + " ");
            num %= a;
            a /= 10;
        }
    }
}

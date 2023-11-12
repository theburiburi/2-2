import java.util.Scanner;

public class LoopSumNumber {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        int evenSum = 0;
        for (int i=2; i <= 100; i++)
        {
            if (i % 2 == 0)
                evenSum += i;
        }
        System.out.printf("The even sum is %d", evenSum);
        System.out.println("\n");

        int squareSum = 0;
        for (int i=1; i<=100; i++)
            squareSum += i*i;
        System.out.printf("The square sum is %d", squareSum);
        System.out.println("\n");

        System.out.printf("Enter a: ");
        int a = keyIn.nextInt();
        System.out.printf("Enter b: ");
        int b = keyIn.nextInt();
        int oddSum = 0;
        for (int i=a; i<=b; i++)
        {
            if (i % 2 == 1)
                oddSum += i;
        }
        System.out.printf("The odd sum is %d.", oddSum);
        System.out.println("\n");

        System.out.printf("Enter an integer number: ");
        int c = keyIn.nextInt();
        int oddDigitSum = 0;
        int digit = 0;
        while (c != 0)
        {
            digit = c % 10;
            if (digit % 2 == 1)
                oddDigitSum += digit;
            c /= 10;
        }
        System.out.printf("The odd digit sum is %d.", oddDigitSum);
        
    }
}

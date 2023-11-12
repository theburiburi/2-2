import java.util.Scanner;

public class TwoPair {
    public static void main(String[] args) {
        Scanner KeyIn = new Scanner(System.in);

        int a = KeyIn.nextInt();
        int b = KeyIn.nextInt();
        int c = KeyIn.nextInt();
        int d = KeyIn.nextInt();

        if((a == b && c == d) || a == c && b == d || a == d && b == c)
        {
            System.out.println("Two pairs.");
        }
        else
        {
            System.out.println("Not two pairs.");
        }
    }
}

import java.util.Scanner;

public class NumOrder {
    public static void main(String[] args) {
        Scanner KeyIn = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = KeyIn.nextInt();
        int b = KeyIn.nextInt();
        int c = KeyIn.nextInt();

        if (a < b && b < c)
        {
            System.out.println("Increasing!");
        }
        else if (c < b && b < a)
        {
            System.out.println("Decreasing!");
        }
        else 
        {
            System.out.println("Neither!");
        }

    }
}

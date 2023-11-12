import java.util.Scanner;

public class Input {
    public static int readInt(Scanner in, String prompt, String error, int min, int max)
    {
        System.out.println(prompt);
        int a = in.nextInt();
        while(true)
        {
            if (min <= a && a <= max)
            {
                return a;
            }
            else
            {
                System.out.println(error);
                System.out.println(prompt);
                a = in.nextInt();
            }
        }
    }
}

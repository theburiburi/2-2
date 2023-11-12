import java.util.Scanner;

public class SodaCanTester
{
   public static void main(String[] args)
   {
        Scanner keyIn = new Scanner(System.in);
        int h, d;
        System.out.print("Please enter the height of sodacan: ");
        h = keyIn.nextInt();
        System.out.print("Please enter the diameter of sodacan: ");
        d = keyIn.nextInt();

        SodaCan soda = new SodaCan(h, d);
        System.out.println("Volume: " + soda.getVolume());
        System.out.println("Surface Area: " + soda.getSurfaceArea());
   }
}

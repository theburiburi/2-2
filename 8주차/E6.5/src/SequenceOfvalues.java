import java.util.Scanner;
public class SequenceOfvalues {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        DataSet data = new DataSet();
        System.out.println("Enter a set of floating-point values. Enter" + "anything ohter than a number to indicate the end of the " + "series: ");
        
        while(keyIn.hasNextDouble())
        {
            double a = keyIn.nextDouble();
            data.add(a);
        }

        System.out.printf("The average of the values is: %.6f", data.getAverage());
        System.out.printf("\n");
        System.out.printf("The smallest value is: %.6f", data.getSmallest());
        System.out.printf("\n");
        System.out.printf("The largest value is: %.6f", data.getLargest());
        System.out.printf("\n");
        System.out.printf("The range is: %.6f", data.getRange());
        System.out.printf("\n");
    }
}

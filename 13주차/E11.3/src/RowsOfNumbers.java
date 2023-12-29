import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RowsOfNumbers
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList <Integer> lines = new ArrayList<>();

        System.out.println ("This program reads variable-length lines of numbers from a file 'data.txt'");
        System.out.println ("and prints the line along with the average.");
        File infile = new File("Object_Oriented_Language/13주차/E11.3/src/data.txt");
        Scanner in = new Scanner(infile);

        int rowNumber = 1;

        while (in.hasNextLine())
        {
            double num = 0;
            double arr[] = new double[10];

            String message = in.nextLine();
            String[] words = message.split(" ");
            
            
            if(!words[0].equals(""))
            {
                for(int i=0; i < words.length; i++)
                {
                    num += Integer.parseInt(words[i]);
                    arr[i] = Integer.parseInt(words[i]);
                }
            //if (words.length != 0)
                num = num / words.length;

                System.out.printf("Row %d:   ",rowNumber++);
                for (int i=0; i < words.length; i++)
                {
                    System.out.print(arr[i] + " ");
                }
                System.out.printf("    average is %.1f \n", num);
                
            }
            else
            {
                System.out.printf("Row %d:",rowNumber++);
                System.out.println("       average is 0.0");
            }
        }
    }
}

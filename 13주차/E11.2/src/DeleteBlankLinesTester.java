import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteBlankLinesTester
{
   public static void main(String[] args)
   {
      BlankLinesRemover.removeLines("Object_Oriented_Language/13주차/E11.2/src/line.txt");
      int count = 0;
      try (Scanner in = new Scanner(new File("Object_Oriented_Language/13주차/E11.2/src/line.txt")))
      {
        while(in.hasNextLine())
        {
            in.nextLine();
            count++;
        }
      } 
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
      System.out.println("Number of non-blank lines: " + count);
   } 
}

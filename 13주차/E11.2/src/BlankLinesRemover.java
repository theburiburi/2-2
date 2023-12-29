import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class BlankLinesRemover
{
    public static void removeLines(String fileName)
    {
        ArrayList <String> lines = new ArrayList<>();
        try (Scanner in = new Scanner(new File("Object_Oriented_Language/13주차/E11.2/src/line.txt")))
        {
            while(in.hasNextLine())
            {
                String message = in.nextLine();
                if (!(message.trim().isEmpty()))
                {
                    lines.add(message);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try (PrintWriter out = new PrintWriter("Object_Oriented_Language/13주차/E11.2/src/line.txt"))
        {
            for (int i = 0; i < lines.size(); i++)
            {
                out.println(lines.get(i));
            }       
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}

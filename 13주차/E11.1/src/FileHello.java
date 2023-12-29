import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHello {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("Object_Oriented_Language/13주차/E11.1/src/hello.txt"))){
            if (in.hasNextLine()){
                String message = in.nextLine();
                System.out.println(message);
            }
            else {
                System.out.println("File is empty or no more lines.");
            }

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        try (PrintWriter out = new PrintWriter("Object_Oriented_Language/13주차/E11.1/src/hello.txt")){
            out.println("Hello, World!");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

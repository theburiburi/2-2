import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        int len = 1;
        for (int i = 0; i < word.length(); i++)
        {
            for(int j = 0; j+len <=  word.length(); j += 1)
            {
                System.out.println(word.substring(j, j+len));
            }
            len += 1;
        }
    }
}

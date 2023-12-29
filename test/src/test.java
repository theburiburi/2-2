import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        Scanner in = new Scanner(System.in);
        //in.useDelimiter("[^A-Za-z]+");
        int i = 1;
        //String a = " 12 3j ";
        //char b = '2';

        //System.out.println(Character.isDigit(a.charAt(i)));
        //a = a.trim();
        //String c = " ";
        //System.out.println(Double.parseDouble(" "));//a));
        //System.out.println(Double.parseDouble(a));
        //int value = in.nextInt();
        float a = -400000000;
        String b = "asd";
        System.out.printf("%c", 'c');
        while (in.hasNext()) { 
            String token = in.nextLine();
            System.out.println("Token: " + token);
            System.out.println(i++);
        }
        String word = in.next();
        //String input = in.nextLine();
        System.out.println(word);
        //System.out.println(input);

        in.close();
    }
}
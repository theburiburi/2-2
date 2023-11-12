import java.util.Arrays;
import java.util.Random;

public class SortedSequence {
   public int[] generateRandom(int n)
   {
      int [] array = new int[n];
      for(int i = 0; i < n; i++)
      {
         Random random = new Random();
         array[i] = random.nextInt(100);
      }
      return array;
   }

   public void printArray(int[] values)
   {
      for (int i = 0; i < values.length; i++)
         System.out.print(values[i] + " ");
      System.out.println();
   }

   public static void main(String[] args)
   {
      SortedSequence sorting = new SortedSequence();
      int[] values = sorting.generateRandom(20);

      sorting.printArray(values);
      Arrays.sort(values);
      sorting.printArray(values);
   }
}
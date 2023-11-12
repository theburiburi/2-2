public class Counter
{
   private int value;
   private int max;

   public int getValue()
   {
      return value;
   }

   public void click()
   {
      value = Math.min(max, value + 1);
   }

   public void reset()
   {
      value = 0;
   }

   public void setLimit(int maximum)
   {

      max = maximum;
   }
}

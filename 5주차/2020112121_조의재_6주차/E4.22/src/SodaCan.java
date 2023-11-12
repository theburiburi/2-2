public class SodaCan
{
   private double diameter;
   private double height;

   public SodaCan(double h, double d)
   {
        height = h;
        diameter = d;
   }
   public double getVolume()
   {
      return diameter*diameter/4*Math.PI*height;
   }

   public double getSurfaceArea()
   {
      return Math.PI*diameter*height + 2*diameter*diameter*Math.PI/4;
   }
}

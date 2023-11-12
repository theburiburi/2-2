public class Geometry
{
   public static double sphereVolume(double r)
   {
      return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
   }

   public static double sphereSurface(double r)
   {
      return 4.0 * Math.PI * r * r;
   }

   public static double cylinderVolume(double r, double h)
   {
      return Math.PI * r * r * h;
   }

   public static double cylinderSurface(double r, double h)
   {
      return 2 * Math.PI * r * (r + h);
   }

   public static double coneVolume(double r, double h)
   {
      return 1.0 / 3.0 * Math.PI * r * r * h;
   }

   public static double coneSurface(double r, double h)
   {
      return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
   }
}

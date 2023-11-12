public class Cylinder {
    public static double cylinderVolume(double r, double h)
    {
       return Math.PI * r * r * h;
    }
 
    public static double cylinderSurface(double r, double h)
    {
       return 2 * Math.PI * r * (r + h);
    }
}

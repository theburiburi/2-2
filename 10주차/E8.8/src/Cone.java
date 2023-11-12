public class Cone {
    
    public double getConeVolume(double r, double h)
    {
       return 1.0 / 3.0 * Math.PI * r * r * h;
    }
 
    public double coneSurface(double r, double h)
    {
       return Math.PI * r * r + Math.PI * r * Math.sqrt(r * r + h * h);
    }
}

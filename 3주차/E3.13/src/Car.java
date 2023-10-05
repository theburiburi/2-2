public class Car
{
   private double efficiency;
   private double gas;

   public Car(double anEfficiency)
   {
        efficiency = anEfficiency;
   }

   public void addGas(double amount)
   {
      gas = amount;
   }

   public void drive(double distance)
   {
      gas =  gas - (distance / efficiency);
   }

   public double getGasInTank()
   {
      return gas;
   }
}

public class EmployeeTester
{
   public static void main(String[] args)
   {
      Employee harry = new Employee("Hacker, Harry", 50000);
      harry.raiseSalary(10);
      System.out.println(harry.getSalary());
   }
}

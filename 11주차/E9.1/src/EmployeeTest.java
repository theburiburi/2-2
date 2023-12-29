public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setName("James Garfield");
        employee.setBaseSalary(23000.00);
        Manager manager = new Manager("Mary Wilson", 25000, 3000);
        System.out.printf("Employee %s makes $%.2f.\n", employee.getName(), employee.getSalary());
        System.out.printf("Manager %s makes $%.2f and a bonus of $%.2f.\n", manager.getName(), manager.getSalary(), manager.getBonus());
    }
}
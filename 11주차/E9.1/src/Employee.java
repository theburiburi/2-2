class Employee
{

    private String name;
    private double baseSalary;

    public Employee() {
       name = "";
       baseSalary = 0.00;
    } 

    public Employee(String name, double baseSalary) {
       this.name = name;
       this.baseSalary = baseSalary;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setBaseSalary(double newSalary)
    {
        baseSalary = newSalary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return baseSalary;
    }
}
class Manager extends Employee
{
    private double bonus;

    public Manager(String newName, double newSalary, double newBonus)
    {
        super(newName,newSalary);
        bonus = newBonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }
}
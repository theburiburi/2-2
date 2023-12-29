public class CheckingAccount extends BankAccount{
    private int month = 0;
    public CheckingAccount()
    {
        super();
    }

    public void withdraw(double amount)
    {
        super.withdraw(amount);
        if(super.getBalance() < 0 && month == 0)
        {
            super.withdraw(20);
            month = 1;
        }
        else if(super.getBalance() < 0 && month == 1)
        {
            super.withdraw(30);
        }
    }

    public void monthEnd()
    {
        month = 0;
    }
}

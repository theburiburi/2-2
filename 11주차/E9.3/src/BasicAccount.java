public class BasicAccount extends BankAccount{

    public BasicAccount(double balance)
    {
        super(balance);
    }

    public void withdraw(double amount)
    {
        super.withdraw(amount);
        if (super.getBalance() < 0)
            super.withdraw(30);
    }
}
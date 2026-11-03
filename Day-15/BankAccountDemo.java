// Encapsulation

class BankAccount
{
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposite(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        }
        else
        {
            System.out.println("Insuficient Balance");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount Withdraw: " + amount);
        }
        else
        {
            System.out.println("Insuficient Balance");
        }
    }

    public void displayDetails()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);
    }
}

public class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount account= new BankAccount("Dipali", 10000);

        account.displayDetails();   

        account.deposite(5000);
        account.withdraw(3000);

        account.displayDetails();
    }
}

/*
o/p:
Account Holder: Dipali
Available Balance: 10000.0
Amount Deposited: 5000.0
Amount Withdrawn: 3000.0
Account Holder: Dipali
Available Balance: 12000.0

*/
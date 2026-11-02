/*
Encapsulation means wrapping data and methods 
into a single class and protecting data 
using access modifiers like private.

Key concepts: 
private variables, getters, setters, data hiding.
*/

class BankAccount
{
    private double balance;

    public void deposite(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
    }

    public double getBalance()
    {
        return balance;
    }
}

public class EncapsulationDemo
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        account.deposite(5000);
        account.deposite(2000);

        System.out.println("Balance: " + account.getBalance());
    }
}

// o/p: Balance: 7000.0
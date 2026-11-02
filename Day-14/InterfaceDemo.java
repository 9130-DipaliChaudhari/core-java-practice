interface Payment
{
    void pay(double amount);
}

class CreditCardPayment implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UpiPayment implements Payment
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid using UPI: " + amount);
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UpiPayment();
        payment.pay(500);
    }
}

/*
o/p:
Paid using Credit Card: 1000.0
Paid using UPI: 500.0
*/
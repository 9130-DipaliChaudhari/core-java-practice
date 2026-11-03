/*
Interface – Payment System
Concept: Abstraction + Runtime Polymorphism
*/


interface Payment
{
    void makePayment(double amount);
}

class UpiPayment implements Payment
{
    @Override
    public void makePayment(double amount)
    {
        System.out.println("UPI Payment: " + amount);
    }
}

class CardPayment implements Payment
{
    @Override
    public void makePayment(double amount)
    {
        System.out.println("Card Payment: " + amount);
    }
}

public class PaymentDemo
{
    public static void main(String[] args)
    {
        Payment payment;

        payment = new UpiPayment();
        payment.makePayment(5000);

        payment = new CardPayment();
        payment.makePayment(3000);
    }
}

/*
o/p:
UPI Payment: 5000.0
Card Payment: 3000.0
*/

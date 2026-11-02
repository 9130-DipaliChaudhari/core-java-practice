/*
Polymorphism means "one name, many forms."

Java supports two main types:
- Compile-time polymorphism – Method overloading
- Runtime polymorphism – Method overriding
*/

class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public double add(double a, double b)
    {
        return a + b;
    }
}

public class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(10.5, 20.5));
    }
}

/*
o/p:
30
60
31.0
*/
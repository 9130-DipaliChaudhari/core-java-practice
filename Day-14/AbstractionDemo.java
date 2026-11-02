/*
Abstraction: hiding implementation details
and showing only essential functionality.

Java supports abstraction using:
- Abstract classes
- Interfaces
*/

abstract class Shape
{
    abstract void calculateArea();
}

class Circle extends Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius=radius;
    }

    @Override 
    void calculateArea()
    {
        double area=Math.PI*radius*radius;

        System.out.printf("Circle Area: %.2f%n", area);
        /*
        println() prints a value or a string.
        printf() prints formatted output.
        %.2f means display a floating-point number with 2 digits after the decimal point.
        %n means insert a new line.
        */
    }
}

class Rectangle extends Shape
{
    private double length;
    private double width;

    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    @Override 
    void calculateArea()
    {
        double area=length*width;

        System.out.println("Rectangle Area: " + area);
    }
}

public class AbstractionDemo
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        circle.calculateArea();
        rectangle.calculateArea();
    }    
}

/*
o/p:
Circle Area: 78.54
Rectangle Area: 50.0
*/
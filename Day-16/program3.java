class Car
{
    // private instance variables
    private String brand;
    private int price;

    // Parameterized Constructor
    public Car(String brand, int price)
    {
        this.brand=brand;
        this.price=price;
    }

    // Getter methods
    public String getBrand()
    {
        return brand;
    }

    public int getPrice()
    {
        return price;
    }

    // Display method
    public void displayDetails()
    {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: " + getPrice());
    }
}

public class program3
{
    public static void main(String[] args)
    {
        // Creating objects
        Car car1=new Car("BMW", 50000000);
        Car car2=new Car("Audi", 4500000);

        // calling methods
        car1.displayDetails();
        System.out.println();

        car2.displayDetails();
    }
}

/*
o/p:
Brand: BMW
Price: 50000000

Brand: Audi
Price: 4500000

*/
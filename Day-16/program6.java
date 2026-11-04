class Mobile
{
    private String brand;
    private int price;
    private int ram;

    // constructor
    public Mobile(String brand, int price, int ram)
    {
        this.brand=brand;
        this.price=price;
        this.ram=ram;
    }

    // Display method
    void displayDetails()
    {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: " + price);
        System.out.println("Mobile RAM: " + ram + " GB ");
    }
}

public class program6
{
    public static void main(String[] args)
    {
        Mobile mobile1=new Mobile("Radmi", 20000, 16);
        Mobile mobile2=new Mobile("Apple", 80000, 32);

        mobile1.displayDetails();
        System.out.println();

        mobile2.displayDetails();
    }
}

/*
o/p:
Mobile Brand: Radmi
Mobile Price: 20000
Mobile RAM: 16 GB

Mobile Brand: Apple
Mobile Price: 80000
Mobile RAM: 32 GB

*/
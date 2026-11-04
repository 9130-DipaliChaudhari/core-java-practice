class Employee
{
    // Instance variable(Encapsulation)
    private String name;
    private int salary;

    // Parameterized Constructor

    public Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }

    // Getter method
    public String getName()
    {
        return name;
    }

    // Getter method
    public int getSalary()
    {
        return salary;
    }

    // Display method
    public void displayDetails()
    {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
    }
}

public class program2
{
    public static void main(String[] args)
    {
        // Creating employee objcets
        Employee employee1=new Employee("Rahul", 30000);
        Employee employee2=new Employee("Priya", 40000);

        // Display employee details
        employee1.displayDetails();
        System.out.println();
        employee2.displayDetails();
    }
}

/*
o/p:
Employee Name: Rahul
Employee Salary: 30000

Employee Name: Priya
Employee Salary: 40000
*/
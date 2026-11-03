/*
Multilevel Inheritance
Concept: Inheritance

Person → Employee → Manager

*/


class Person
{
    String name;

    Person(String name)
    {
        this.name = name;
    }

    void displayName()
    {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person
{
    int employeeId;

    Employee(String name, int employeeId)
    {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployeeId()
    {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee
{
    String department;

    Manager(String name, int employeeId, String department)
    {
        super(name, employeeId);
        this.department = department;
    }

    void displayDepartment()
    {
        System.out.println("Department: " + department);
    }
}

public class MultilevelDemo
{
    public static void main(String[] args)
    {
        Manager manager =
            new Manager("Rahul", 101, "IT");

        manager.displayName();
        manager.displayEmployeeId();
        manager.displayDepartment();
    }
}


/*
o/p:
Name: Rahul
Employee ID: 101
Department: IT

*/
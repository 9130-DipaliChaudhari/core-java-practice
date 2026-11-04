class Student
{
    String name;
    int age;

    // Paramaterized Constructor
    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    // method
    void display()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class program1
{
    public static void main(String[] args)
    {
        Student student=new Student("Dipali", 23);

        student.display();
    }
}

/*
o/p:
Student Name: Dipali
Student Age: 23

*/
/*
Inheritance allows one class to acquire
the properties and methods of another class.

Key concepts: 
extends, parent class, child class, code reusability.
*/

class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        // Dog object can call both eat() and bark().
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}

/*
o/p:
    Animal is eating
    Dog is barking
*/

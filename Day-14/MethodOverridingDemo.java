//Method Overriding
//The child class provides its own implementation of a parent class method.

class Animal
{
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}

// o/p:
// Dog barks
//Cat meows
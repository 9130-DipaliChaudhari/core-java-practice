class Animal
{
    public void eat()
    {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog
{
    public void play()
    {
        System.out.println("Puppy is playing");
    }
}

public class MultilevelInheritanceDemo
{
    public static void main(String[] args)
    {
        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}

/*
o/p:
Animal eats food
Dog barks
Puppy is playing





The inheritance chain is:

Animal → Dog → Puppy

The Puppy class inherits methods from both Animal and Dog.

*/
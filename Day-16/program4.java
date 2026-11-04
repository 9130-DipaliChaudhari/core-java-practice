class Book
{
    private String title;
    private String author;
    private int price;

    // Parameterized Constructor
    public Book(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    // display methods
    public void displayDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
    }
}

public class program4
{
    public static void main(String[] args)
    {
        Book book1=new Book("Java Programming", "James", 500);
        Book book2=new Book("Python", "Guido", 400);
        
        book1.displayDetails();
        System.out.println();

        book2.displayDetails();
    }
}

/*
o/p:
Book title: Java Programming
Book author: James
Book price: 500

Book title: Python
Book author: Guido
Book price: 400 

*/
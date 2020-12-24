package q_01;
/*
Create class Book with the following:
	i) Data Members:name,price,Author author(object)
	ii) Constructor with args to initialize the variables. 
	iii)Create method showDetails() to display the details.
 */
public class Book
{
	String name;
	int price;
	Author author;
	
	public Book(String name, int price,Author author )
	{
		this.author = author;
		this.name = name;
		this.price = price;
	}
	
	void showDetails() 
	{
		System.out.println("book name => "+name);
		System.out.println("Book price => "+price);
		System.out.println("Book author Name => "+author.getAuthorName());
		System.out.println("Book author Age => "+author.getAge());
		System.out.println("Book author Place  => "+author.getPlace());
	}
	
}

package q_01;
/*
Write a program to illustrate the concept of containment:
a) Create a class Author with the following:
	i) Data Members: authorName,age,place.
	ii) Constructor with arguments to initialize the variables. 
	iii)Use getter methods to get values.
b) Create class Book with the following:
	i) Data Members:name,price,Author author(object)
	ii) Constructor with args to initialize the variables. 
	iii)Create method showDetails() to display the details.
 */
public class Author 
{
	String authorName;
	int age;
	String place;
	
	public Author(String authorName, int age, String place)
	{
		super();
		this.authorName = authorName;
		this.age = age;
		this.place = place;
	}

	public String getAuthorName() {
		return authorName;
	}

	public int getAge() {
		return age;
	}

	public String getPlace() {
		return place;
	}
}

package q_01;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Author a = new Author("Mr. Mayur", 19,"iofuhj");
		
		Book obj = new Book("Math", 100,a);
		obj.showDetails();
	
	}
}

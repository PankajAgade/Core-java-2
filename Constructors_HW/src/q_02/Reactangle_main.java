package q_02;

public class Reactangle_main 
{
	public static void main(String[] args) 
	{
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(10,10);
		Rectangle obj3 = new Rectangle(10);
		
		obj1.calculateArea();
		obj2.calculateArea();
		obj3.calculateArea();		
	}
}

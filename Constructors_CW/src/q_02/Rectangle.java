package q_02;
/*
Create a class Rectangle with two instance variables: length and width. 
Create a constructor initialing the instance variables.Subsequently, two objects of this class are created and
 then the methods rectangleArea() and rectanglePerimeter() are invoked.
 */
public class Rectangle 
{
	int length;
	int width;
	
	public Rectangle(int length, int width) 
	{
		super();
		this.length = length;
		this.width = width;
	}
	
	void rectangleArea()
	{
		System.out.println("Area of rectange => "+(length*width));
	}
	
	void rectanglePerimeter()
	{
		System.out.println("Perimeter of rectangle => "+(2*length + 2*width));
	}
}

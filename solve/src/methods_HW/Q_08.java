package methods_HW;
/*
Write a program to do the following: Create a class “Square”.
Create a method “calculateArea”, with length as an argument,

Now calculate the area and return area. 
Create another class “SquareDemo”in which main method should invoke the Square class method by passing a value for the length.
 */
public class Q_08 
{
	public static void main(String[] args) 
	{
		Q_08_Square obj = new Q_08_Square();
		
		int area = obj.calculateArea(10);
		System.out.println("Area of square => "+area);
				
	}
}

package methods_CW;
/*
Write a program to show method overloading by performing following steps:
Create a class to print the area of a square, a rectangle and a triangle. 
The class has3 methods with the same name but different number of parameters. 
The method for printing area of rectangle has two parameters which are length and breadth respectively, 
for printing the area of triangle method has 3 parameters and while the other method for printing area of 
square has one parameter which is side of square.
 */
public class Q_02 
{
	public static void main(String[] args) 
	{
		Q_02_Area obj = new Q_02_Area();
		
		obj.area(5);
		obj.area(5, 5);
		obj.area(0.5, 10, 10);
	}
}

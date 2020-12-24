package q_05;
/*
Create a class ShapeCircle.java and do the following steps:

a) Add an instance float variable pi and create two overloaded constructors. 
	Constructor 1- with a float argument name radius. 
	The constructor should initialize the class variable radius with the method argument radius. 
	The instance variable and the method argument should be named same as “radius”.
	
b) Constructor 2- with two float arguments radius and pi. Default the class pi value to
	3.5 and set the instance variable with the radius method argument.
	
c) The constructor “constructor 2” should be invoked from a main method from class, Area.java.

In Circle.java, invoke the Constructor 2 created in the previous step from Constructor 1.
 */
public class ShapeCircle 
{
	float pi = 3.5f;
	
	ShapeCircle(float radius)
	{
		System.out.println("Area of circle => "+(2*radius*pi));
	}
	
	
	ShapeCircle(float radius, float pi)
	{
		this(radius);
		System.out.println("Area of circle => "+(2*radius*pi));
		
	}
}

package q_06;
/*
Create two methods and calculate area and circumference of a Circle In the Circle.javaclass, 
create two methods as listed below

a. Method 1 – calculate CircleArea should accept the float radius as parameter and calculate the area (pi*r*r). 
	It should return the result value to the main method where it should be printed in the console.
	
b. Method 2 – calculate Circumference should accept float radius as parameter and calculate the 
	circumference (2 * pi * r). It should return the result value to the main method where it should 
	be printed in the console.
	
Call these two methods from the main method in Circle.java by passing appropriate parameters.
 */
public class Circle 
{
	float area(float radius)
	{
		return radius*3.15f*radius;
	}
	
	float circumference(float radius)
	{
		return 2*3.15f*radius;
		
	}
}

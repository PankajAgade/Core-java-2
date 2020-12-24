package methods_HW;
/*
Define class “Triangle”.
a) Define data Members as :
i. Side1
ii. Side2
iii. Side3
iv. Angle1,Angle2,Angle3
b) Define constructors as per requirement.
c) Define methods as :
i. trianglePerimeter() ii.triangleArea() iii.isosceles() iv.equilateral() v.rightAngled()
Test this class by creating an object for the class triangle.
 */
public class Q_04 
{
	public static void main(String[] args) 
	{
		Q_04_Triangle obj = new Q_04_Triangle(100, 50, 80, 90, 45, 45);
		obj.trianglePerimeter();
		obj.triangleArea();
		obj.isosceles();
		obj.equilateral();
		obj.rightAngled();
		
	}
}

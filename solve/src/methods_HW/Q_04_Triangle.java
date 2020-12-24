package methods_HW;

public class Q_04_Triangle 
{
	int side1;
	int side2;
	int side3;
	
	int angle1;
	int angle2;
	int angle3;
	
	public Q_04_Triangle(int side1, int side2, int side3, int angle1, int angle2, int angle3) 
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle3;
	}
	
	
	void trianglePerimeter()
	{
		System.out.println("Perimeter of Triangle : "+(side1+side2+side3));
	}
	
	void triangleArea()
	{
		int s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
		System.out.println("Area of Triangle : "+area);
	}
	
	void isosceles()
	{
		if (side1==side2 || side1==side3 || side2==side3)
		{
			System.out.println("Given Trangle is isosceles Trangle");
		}
		else
		{
			System.out.println("Given Trangle is not isosceles Trangle");
		}
	}
	
	void equilateral()
	{
		if (side1==side2 && side1==side3)
		{
			System.out.println("Given Trangle is equilateral Trangle");
		}
		else
		{
			System.out.println("Given Trangle is not equilateral Trangle");
		}
	}
	
	void rightAngled()
	{
		if (angle1==90 || angle2==90 || angle3==90) 
		{
			System.out.println("Given Trangle is Right Angle Trangle");
		}
		else
		{
			System.out.println("Given Trangle is not Right Angle Trangle");
		}
	}
	
	
	
	
	
	
	
	
	
	
}

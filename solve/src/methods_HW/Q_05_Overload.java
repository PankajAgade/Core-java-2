package methods_HW;

public class Q_05_Overload 
{
	void test(int a)
	{
		System.out.println("Area of square = "+(a*a));
	}
	
	void test(int a, int b)
	{
		System.out.println("Area of Rectangle = "+(a*b));
	}
	
	void test(double a, int b, int c)
	{
		System.out.println("Area of Trangle = "+(a*b*c));
	}
	
	void test(int a, int b, int c, int d)
	{
		System.out.println("Perimeter of Rectangle = "+(a+b+c+d));
	}
	
	
}

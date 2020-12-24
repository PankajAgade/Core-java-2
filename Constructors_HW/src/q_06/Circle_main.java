package q_06;

public class Circle_main 
{
	public static void main(String[] args) 
	{
		Circle obj = new Circle();
		
		float area = obj.area(10);
		float circumference = obj.circumference(10);
		
		System.out.println("Area os circle => "+area);
		System.out.println("Circumference os circle => "+circumference);
		
	}
}

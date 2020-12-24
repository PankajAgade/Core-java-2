package basics_Of_Java_cw;

public class Q_04_01 
{
	void swap(int a, int b)
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	
		int temp = a;
		a = b ;
		b = temp ;
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~After swapping~~~~~~~~~~~~~~");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}

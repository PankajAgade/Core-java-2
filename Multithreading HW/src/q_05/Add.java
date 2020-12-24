package q_05;

public class Add	
{
	static int a=0;
	
	static synchronized void sum()
	{
		for (int i = 0; i < 10000; i++) 
		{
			a++;
//			System.out.println(a);
		}
	}
}

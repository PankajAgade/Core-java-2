package q_04;

public class Add 
{
	int a=0;
	
	synchronized void sum()
	{
		for (int i = 0; i < 10000; i++) 
		{
			a++;
//			System.out.println(a);
		}
	}
}

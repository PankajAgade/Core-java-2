package q_02;

public class T2 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am from T2");
		}
	}
}

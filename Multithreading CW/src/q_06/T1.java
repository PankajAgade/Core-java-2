package q_06;

public class T1 implements Runnable
{

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am from Thread.");
		}
	}

}

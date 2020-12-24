package q_03;

public class T1 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("I am from T1");
		}
	}
}

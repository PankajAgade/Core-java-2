package q_07;

public class T1 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am from T1.");
		}
	}
}

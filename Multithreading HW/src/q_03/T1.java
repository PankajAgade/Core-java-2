package q_03;

public class T1 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(" => "+i);
		}
		System.out.println();
	}
}

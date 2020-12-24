package q_05;

public class T1 extends Thread
{
	@Override
	public void run() 
	{
		boolean n = Thread.currentThread().isDaemon();
		if (n) 
		{
			System.out.println("That is daemon thread.");
		}
		else
		{
			System.out.println("User Define thread.");
		}
	}
}

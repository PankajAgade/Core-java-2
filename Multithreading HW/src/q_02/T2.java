package q_02;

public class T2 extends Thread
{
	@Override
	synchronized public void run() 
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("5 * "+i+" = "+(5*i));
		}
	}
}

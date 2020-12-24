package q_04;

public class T2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am from T2");
			try {sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

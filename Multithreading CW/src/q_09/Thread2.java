package q_09;

public class Thread2 extends Thread
{
	Shop a;
	public Thread2(Shop obj)
	{
		a=obj;
	}
	
	@Override
	public synchronized void run()
	{
		for (int i = 0; i < 20; i++)
		{
			a.produce();
			
			try {sleep(1000);} catch (InterruptedException e) {}
		}
		
	}
}

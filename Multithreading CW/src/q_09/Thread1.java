package q_09;

public class Thread1 extends Thread
{
	Shop biscuit;
	public Thread1(Shop obj) 
	{
		biscuit=obj;
	}
	
	@Override
	public synchronized void run() 
	{
		for (int i = 0; i < 20; i++) 
		{
			biscuit.consume();
			
		}
		
	}
	
}

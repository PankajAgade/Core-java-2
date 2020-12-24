package q_09;

public class Shop 
{
	int biscuit = 0;
	synchronized void consume()
	{
		if (biscuit<=5)
		{
			System.out.println("iN CONSUME");
			try {wait();} catch (InterruptedException e) {}
		}
		
		biscuit--;
		notify();
		System.out.println("Consume and Store => "+biscuit);
		
	}
	
	synchronized void produce()
	{
		biscuit++;
		System.out.println("Produce and Store => "+biscuit);
		if (biscuit>5)
		{
			notify();
		}
	}
}

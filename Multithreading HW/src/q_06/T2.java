package q_06;

public class T2 extends Thread
{
	Circle obj;
	public T2(Circle obj)
	{
		this.obj = obj;
	}
	
	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			obj.area();
			try {sleep(1000);} catch (InterruptedException e) {}
		}
	}
	//area
}

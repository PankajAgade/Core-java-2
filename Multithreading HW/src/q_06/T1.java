package q_06;

public class T1 extends Thread
{
	Circle obj;
	public T1(Circle obj)
	{
		this.obj = obj;
	}

	@Override
	public void run() 
	{
		for (int i = 0; i < 10; i++) 
		{
			obj.Radius(i);
			try {sleep(1000);} catch (InterruptedException e) {}
		}
	}
	//radius
}

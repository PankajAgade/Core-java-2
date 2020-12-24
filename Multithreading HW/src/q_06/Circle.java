package q_06;

public class Circle 
{
	int r=0;
	synchronized void Radius(int r)
	{
		this.r=r;
		if (r>0)
		{
			notify();
		}
		System.out.println("Radius => "+r);
	}
	
	synchronized void area()
	{
		if (r==0) 
		{
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Area => "+(3.14*r*r));
		
	}
}

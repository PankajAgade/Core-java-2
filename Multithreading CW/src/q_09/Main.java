package q_09;

public class Main 
{
	public static void main(String[] args) 
	{
		Shop obj = new Shop();
		
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		
		t2.start();
		t1.start();
		
	}
}

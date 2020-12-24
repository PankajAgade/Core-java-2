package q_06;

public class Q_06 
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		Thread obj = new Thread(t1);
		obj.start();
		obj.yield();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println("I am from Main.");
		}
	}
}

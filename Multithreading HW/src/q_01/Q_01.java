package q_01;

public class Q_01 
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		
		T2 t2 = new T2();
		Thread obj = new Thread(t2);
		
		t1.start();
		obj.start();
		
	}
}

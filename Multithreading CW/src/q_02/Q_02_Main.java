package q_02;

public class Q_02_Main
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		Thread obj1 = new Thread(t1);
		
		T2 t2 = new T2();
		Thread obj2 = new Thread(t2);
		
		T3 t3 = new T3();
		Thread obj3 = new Thread(t3);
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}
}

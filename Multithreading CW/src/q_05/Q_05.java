package q_05;

public class Q_05 
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		t1.setDaemon(true);
		t1.start();
		
		System.out.println();
		
		T1 t2 = new T1();
		t2.start();
	}
}

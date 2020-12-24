package q_06;

public class Main 
{
	public static void main(String[] args) 
	{
		Circle obj = new Circle();
		
		T1 t1 = new T1(obj);
		
		T2 t2 = new T2(obj);
		
		t1.start();
		t2.start();
		
	}
}

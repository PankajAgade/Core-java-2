package q_05;

public class T2 extends Thread
{
	Add s ;

	public T2(Add obj) 
	{
		s = obj;
	}
	@Override
	public void run() 
	{
		s.sum();
	}
}

import java.util.Iterator;
import java.util.TreeSet;

public class Q_11 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(10);
		ts.add(6);
		ts.add(10);
		ts.add(1);
		ts.add(3);
		
		
		System.out.println("Tree set => "+ts);
		
		Iterator<Integer> it = ts.iterator();
		
		while(it.hasNext())
		{
			int n = it.next();
			if (n<7)
			{
				System.out.println("Less than 7 element => "+n);
			}
		}
		
	}
}

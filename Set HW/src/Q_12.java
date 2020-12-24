import java.util.Iterator;
import java.util.TreeSet;

public class Q_12 
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
		
		System.out.println("Greter than or equal to => "+ts.ceiling(5));
		System.out.println("Less than or equal to element => "+ts.floor(5));
		
	}
}

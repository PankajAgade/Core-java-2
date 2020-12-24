import java.util.Iterator;
import java.util.TreeSet;

public class Q_18 
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
		
		ts.remove(6);
		
		System.out.println("Tree set after => "+ts);
	}
}

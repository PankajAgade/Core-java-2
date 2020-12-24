import java.util.Iterator;
import java.util.TreeSet;

public class Q_16_and_17 
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
		
		System.out.println("First => "+ts.pollFirst());
		System.out.println("Last  => "+ts.pollLast());
	}
}

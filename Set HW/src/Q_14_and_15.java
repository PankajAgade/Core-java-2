import java.util.Iterator;
import java.util.TreeSet;

public class Q_14_and_15 
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
		
		System.out.println("Strictly grater than or equal to element => "+ts.higher(5));
		System.out.println("Strictly less   than or equal to element => "+ts.lower(5));
	}
}

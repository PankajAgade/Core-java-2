import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Q_07 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");
		
		System.out.println("Tree set => "+ts);
		
		Iterator<String> it = ts.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}
}

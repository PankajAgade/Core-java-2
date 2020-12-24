import java.util.Iterator;
import java.util.TreeSet;

public class Q_05 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}

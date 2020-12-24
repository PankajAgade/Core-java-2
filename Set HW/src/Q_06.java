import java.util.TreeSet;

public class Q_06 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");
		
		System.out.println("Tree set => "+ts);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.addAll(ts);
		
		System.out.println("Tree set => "+ts2);
	}
}

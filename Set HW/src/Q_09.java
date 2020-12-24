import java.util.TreeSet;

public class Q_09 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");
		
		System.out.println("Tree set => "+ts);
		
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1 = (TreeSet<String>) ts.clone();
		
		System.out.println("Tree Set 1 => "+ts1);
		
	}
}

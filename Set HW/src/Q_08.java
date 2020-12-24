import java.util.TreeSet;

public class Q_08 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Red");
		ts.add("Black");
		ts.add("White");
		ts.add("Yellow");
		
		System.out.println("Tree set => "+ts);
	
		System.out.println("First Element => "+ts.first());
		
		System.out.println("Last Element  => "+ts.last());
	}
}

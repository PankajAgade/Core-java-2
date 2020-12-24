import java.util.HashSet;
import java.util.TreeSet;

public class Q_08 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		System.out.println("Hash Set => "+hs);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(hs);
		
		System.out.println("Tree Set => "+ts);
	}
}

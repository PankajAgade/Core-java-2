import java.util.HashSet;

public class Q_01
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
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		hs1.add(60);
		
		System.out.println("Hash Set 1 => "+hs1);
		
		System.out.println("compare => "+hs.containsAll(hs1));
	}
}

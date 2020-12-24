import java.util.HashSet;

public class Q_06 
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
		
		hs1 = (HashSet<Integer>) hs.clone();
		
		System.out.println("Hash set 2 => "+hs1);
		
	}
}

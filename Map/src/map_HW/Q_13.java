package map_HW;

import java.util.Set;
import java.util.TreeMap;

public class Q_13 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("India", +91);
		tm.put("USA", +95);
		tm.put("Koria", +90);
		tm.put("China", +81);
		tm.put("Pakisthan", +91);
		tm.put("Shrilanka", +92);
		
		System.out.println(tm);	
		
		tm.clear();
		
		System.out.println(tm);
	}
}

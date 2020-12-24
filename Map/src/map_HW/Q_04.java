package map_HW;

import java.util.HashMap;
import java.util.Set;

public class Q_04 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("India", +91);
		hm.put("USA", +95);
		hm.put("Koria", +90);
		hm.put("China", +81);
		hm.put("Pakisthan", +91);
		hm.put("Shrilanka", +92);
		
		
		System.out.println(hm);
		
		Set<String> s = hm.keySet();
		
		System.out.println(s);
	}
}

package map_CW;

import java.util.HashMap;
import java.util.Map;

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
		
		//hm.clear();
		
		System.out.println(hm);
		
		
		for(Map.Entry<String, Integer> x:hm.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}

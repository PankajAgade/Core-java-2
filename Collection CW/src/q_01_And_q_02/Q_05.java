package q_01_And_q_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_05 
{
	public static void main(String[] args) 
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Black");
		color.add("White");
		color.add("Red");
		color.add("YEllow");
		color.add("Orange");
		color.add("Green");
		color.add("Purpule");
		
		System.out.println(color);
		

		color.set(0, "Brown");
		
		
		Iterator<String> it = color.iterator();
		while (it.hasNext()) 
		{
			System.out.print(it.next()+" ");			
		}
		
		
	}
}
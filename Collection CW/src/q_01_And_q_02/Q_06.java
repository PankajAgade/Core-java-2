package q_01_And_q_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Q_06 {

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
		
		Iterator<String> it = color.iterator();
		
		color.remove(3);
		
		System.out.println(color);
		
		
	}
}
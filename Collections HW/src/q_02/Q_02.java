package q_02;

import java.util.ArrayList;

public class Q_02 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);
		
		System.out.println("Array list 1 => "+al1);
		System.out.println("Array list 2 => "+al2);
		
		System.out.println("Compare => " + al1.contains(al2));
		
		
	}
}

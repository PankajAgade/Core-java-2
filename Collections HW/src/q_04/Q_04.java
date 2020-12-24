package q_04;

import java.util.ArrayList;

public class Q_04
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
		al2 = (ArrayList<Integer>) al1.clone();
		
		System.out.println("Array list 1 => "+al1);
		System.out.println();
		System.out.println("Array list 2 => "+al2);
	}
}

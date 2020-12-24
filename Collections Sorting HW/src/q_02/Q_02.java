package q_02;

import java.util.ArrayList;
import java.util.Collections;

public class Q_02
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add(new String("Pankaj"));
		al.add(new String("Mayur"));
		al.add(new String("Mayuri"));
		al.add(new String("Sagar"));
		al.add(new String("Kishor"));
		al.add(new String("Chetan"));
		
		
		System.out.println(al);
		
		Collections.sort(al, new comp());
		
		System.out.println(al);
		
	}
}

package Q_02;

import java.util.ArrayList;
import java.util.Collections;

public class Q_02_main 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(12, "Pankaj"));
		al.add(new Employee(100, "Mayur"));
		al.add(new Employee(100, "Kishor"));
		al.add(new Employee(70, "Sagar"));
		al.add(new Employee(10, "Chetan"));
		
		System.out.println(al);
		
		Collections.sort(al, new comp());
		
		System.out.println(al);
	}
}

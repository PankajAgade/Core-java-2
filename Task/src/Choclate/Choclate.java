package Choclate;

import java.util.ArrayList;
import java.util.Scanner;

import task1.m;

public class Choclate 
{
	static int total = 0;
	static int order;
	static String s;
	static int choice;
	static Scanner kb = new Scanner(System.in);
	static ArrayList<ChoclateBox> list = new ArrayList<ChoclateBox>();
	public static void main(String[] args) 
	{
		
		
		list.add(new ChoclateBox(1, "Ghirardelli", 35));
		list.add(new ChoclateBox(2, "Patchi", 25));
		list.add(new ChoclateBox(3, "Galaxy", 40));
		list.add(new ChoclateBox(4, "Cadbury", 30));
		list.add(new ChoclateBox(5, "Ferrero Rocher", 40));
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		
		
		System.out.print("Enter the choclate Sr no. : ");
		choice = kb.nextInt();
		choice--;
		
		
		
		System.out.println("1.confirmation of the order.");
		System.out.println("2.Change Order.");
		System.out.println("3.cancel order.");
		
		System.out.print("Enter the option : ");
		order = kb.nextInt();
		
		switch (order)
		{
		case 1:
			conformorder();
			break;

		case 2:
			conformorder();
			break;

		case 3:
			System.out.println("Exit ");
			break;

		default:
			break;
		}
		
		
 	}

	private static void conformorder()
	{
		System.out.print("Enter money : ");
		kb.nextLine();
		s = kb.nextLine();
		
		String[] M = s.split(",");	
		
		for (int i = 0; i < M.length; i++)
		{
			total = total + Integer.parseInt(M[i]);
		}
		
		if (list.get(choice).price<=total) 
		{
			System.out.println(list.get(choice).chocolateName+" | "+(total-list.get(choice).price));
		}
	}
	
	
}

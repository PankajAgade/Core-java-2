package oop_s_HW;

import java.util.Scanner;

/*
Let us Assume and do the programming: An organization provides Diwali bonus of 35% to their employees. 
If the year of service of that employee is more than 5 years and gives Diwali bonus of 15% to the employees 
if the year of service is less than 5 years. Now Create a class and its respective methods to enter the data 
from the user and calculate total salary of the employee
 */
public class Q_01 
{
	public static void main(String[] args) 
	{
		int year;
		String name;
		int age;
		int salary;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enetr the year : ");
		year = kb.nextInt();
		
		System.out.print("Enetr the name : ");
		name = kb.next();
		
		System.out.print("Enetr the age : ");
		age = kb.nextInt();
		
		System.out.print("Enetr the Basic salary : ");
		salary = kb.nextInt();
		
		
		
		Q_01_input obj = new Q_01_input(year, name, age, salary);
		
		obj.claculateBonus();
		
	}
}

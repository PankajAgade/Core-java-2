package oop_s_CW;
/*
Create a class AdditionDemo having 3 instance variables number1 ,number2 and result.
1) Create 4 methods as a) addition b) subtraction c) multiplication d) division.
2) Calculate different operations as per the methods determined above. Create objects of AdditionDemo from main method of another class Addition.
 */
public class Q_02 
{
	public static void main(String[] args) 
	{
		AdditionDemo obj = new AdditionDemo();
		
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
	}
}

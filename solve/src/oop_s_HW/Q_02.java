package oop_s_HW;
/*
Assume another company which is a laptop manufacturer company needs to develop laptop swhich does the following: 
On unlocking the screen it will display a “WELCOME” message first, After “ welcome “ message displays →
“Enter Option:”
	1. Add-1
	2. Subtract-2
	3. Multiply-3
	4. Quit-4
The user should be allowed to enter an option. If the user enters 1, a message needs to be displayed,
“Enter two numbers to be added”.
	a. The user should be allowed to enter two numbers (In two separate lines).
	b. Based on the numbers entered, the program should add and display the result as below
	c. “The result is<result>”
	d. After the result is displayed, the program should loop back and ask for the next menu entry. 
		If the user enters 4, the program should quit. 
		(The program needs to be executed and do either one of the options until the kid enters theoption4)
 */
public class Q_02 
{
	public static void main(String[] args) 
	{
		System.out.println("WELCOME");
		
		Q_02_Oparetion obj = new Q_02_Oparetion();
		
		obj.option();
		
	}
}

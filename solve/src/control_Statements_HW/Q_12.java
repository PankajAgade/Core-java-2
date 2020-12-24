package control_Statements_HW;

import java.util.Scanner;

/*
Write a program to input marks of five subjects by the user. Now calculate sum and percentage of the marks. Find the grade according to following:
a. Percentage >= 90% : Grade A
b. Percentage >= 80% : Grade B
c. Percentage >= 70% : Grade C
d. Percentage >= 60% : Grade D
e. Percentage >= 40% : Grade E
f. Percentage < 40% : Grade F
 */
public class Q_12 
{
	public static void main(String[] args) 
	{
		int sub1 ;
		int sub2 ;
		int sub3 ;
		int sub4 ;
		int sub5 ;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter marks of 5 subject ");
		sub1 = kb.nextInt();
		sub2 = kb.nextInt();
		sub3 = kb.nextInt();
		sub4 = kb.nextInt();
		sub5 = kb.nextInt();
		
		
		Q_12_01 obj = new Q_12_01();
		
		obj.percentage(sub1, sub2, sub3, sub4, sub5);
	}
}

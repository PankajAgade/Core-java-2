package basics_Of_Java_cw;
/*
Write a program to find Compound Interest.
Here P is principal amount. R is the annual interest rate. t is the time.
n is the number of times that interest is compounded per unit t, for example if interest is compounded monthly and t is in years then the value of n would be 12. If interest is compounded quarterly and t is in years then the value of n would be 4.
e.g P = 2000.
R = 8/100 = 0.08 (decimal). n = 12.
t = 5.
Compound Interest = 2000 (1 + 0.08 / 12) (12 * 5) � 2000 = $979.69
 */
public class Q_06 
{
	public static void main(String[] args) 
	{
		int p = 2000;
		double r = 0.08; 
		int n = 12;
		int t = 5;
		
		Q_06_01 obj = new Q_06_01();
		
		obj.calculator_CI(p, r, n, t);
	}
}

package control_Statements_CW;
/*
Consider a situation below of the electricity unit charges. 
Now input electric units by the user and calculate total electricity bill according to the given condition.
For first 50 units Rs. 0.50/unit 
For next 100 units Rs.0.75/unit 
For next 100 units Rs. 1.20/unit 
For unit above 250 Rs.1.50/unit
An additional surcharge of 20% is added to the bill 
 */
public class Q_04 
{
	public static void main(String[] args) 
	{
		Q_04_electricBill obj = new Q_04_electricBill();
		
		obj.input();
	}
}

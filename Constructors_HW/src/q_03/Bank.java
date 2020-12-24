package q_03;
/*
Create a class Bank .Initialize an instance variable ” amount” with an initial amount of Rs.5000 and 
assume you have to add some more amount to it. Now make two constructors of this class as follows:

1 - without any parameter - no amount will be added to the Bank
2 - having a parameter which is the amount that will be added to Bank Create object of the 'AddAmount' class 
	and display the final amount in Bank
 */
public class Bank
{
	int amount=5000;
	
	Bank()
	{
		System.out.println("no amount will be added to the Bank");
	}

	public Bank(int amount) 
	{
		this.amount = this.amount + amount;
		System.out.println("final amount in Bank is "+this.amount);
	}
	
	
}

package q_07_Stack;

import java.util.Scanner;

public class Stack_opration
{
	int[] arr = new int[5];
	int top = 0;
	int key;
	

	Scanner kb = new Scanner(System.in);
	
	void display()
	{
		for (int p : arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	void option()
	{

		System.out.println("1. POP");
		System.out.println("2. Push");
		System.out.println("3. Exit");
		
		System.out.print("Enter option : ");
		key = kb.nextInt();
		action();
	}
	
	void action()
	{
		switch (key) 
		{
			case 1:
				pop();
				display();
				option();
				break;
			
			case 2:
				push();
				display();
				option();
				break;
			
			case 3:
				System.out.println("Bye Bye Boss");
				break;
			
			default:
				System.out.println("Invalid option");
				break;
		
		}
	
	}

	public void push()
	{
		if (top==arr.length-1)
		{
			System.out.println("Srry boss element not enter bcoz stac is full");
		}
		else
		{
			System.out.print("Enter the element for push operation : ");
			int value = kb.nextInt();
			arr[top]=value;
			top++;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Pop opration not exicute.");
			return 0;
		}
		else
		{
			int a = arr[top];
			top--;
			arr[top]=0;
			return a;
		}
	}
}

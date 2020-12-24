package q_15_LEADERS_print;

public class LeadersLogic 
{
	int[] arr1 = {1,2,3,4,3,8,2,6,7,2};
	
	void printLeaders()
	{
		
		for (int i = 0; i < arr1.length; i++) 
		{
			boolean flag = true;
			for (int j = i+1; j < arr1.length; j++) 
			{
				if (arr1[i]<arr1[j])
				{
					flag = false;
				}
			}
			if (flag) 
			{
				System.out.println("Leader => "+arr1[i]);
			}
		}
	}

	
	void display()
	{
		System.out.print("Array  => ");
		for (int i : arr1) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}

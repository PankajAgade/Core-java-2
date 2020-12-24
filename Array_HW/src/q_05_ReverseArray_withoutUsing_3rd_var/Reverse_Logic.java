package q_05_ReverseArray_withoutUsing_3rd_var;

public class Reverse_Logic 
{
	int[] arr = {1,2,3,4,8,6,7};


	void reverse()
	{
		System.out.print("Array => ");
		for (int i = 0; i < arr.length/2; i++) 
		{
			//a=a+b;
			//b=a-b;
			//a=a-b;
			arr[i]=arr[i]+arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i]-arr[arr.length-1-i];
			arr[i]=arr[i]-arr[arr.length-1-i];
		}
	}
	
	void display()
	{
		System.out.print("Array => ");
		for (int i : arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

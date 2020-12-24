package q_32_parameter_method;

public class Parameter_method
{
	public static void main(String[] args) 
	{
		Input obj = new Input();
		
		int[] arr = obj.input();
		

		System.out.println();
		System.out.print("Input array => ");
		
		for (int p : arr) 
		{
			System.out.print(p+" ");
		}
		System.out.println();
	
	}
}

package q_05_transpose;

public class Main
{
	public static void main(String[] args) 
	{
		Input obj1 = new Input();
		int[][] arr = obj1.input();
		
		Transpose obj2 = new Transpose();
		obj2.print(obj2.logic(arr));
	}
}

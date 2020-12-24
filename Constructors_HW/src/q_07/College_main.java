package q_07;

public class College_main 
{
	public static void main(String[] args) 
	{
		College obj = new College();
		obj.outerclass();
		
		College.Department obj2 = obj.new Department();
		obj2.innerclass();
		
	}
}

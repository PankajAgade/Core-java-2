package q_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_06 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			br.read();
		} 
		catch (IOException e)
		{
			throw new IOException("Sorry ");
		}
	}
}

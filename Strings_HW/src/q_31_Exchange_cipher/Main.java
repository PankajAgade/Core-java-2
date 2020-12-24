package q_31_Exchange_cipher;

public class Main 
{
	public static void main(String[] args) 
	{
		Exchange_cipher_Logic obj = new Exchange_cipher_Logic();
		
		System.out.println("String => "+obj.s);
		
		obj.exchange_cipher();
	}
}

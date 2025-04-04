package ExceptionsHandlingEx1;
import java.util.*;
public class comExceptionHandlingLearn {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your PIN : ");
		int pin = sc.nextInt();
		int balance = 10000;
		if(pin == 5567)
		{
			System.out.println("Your Bank Balance : " + balance);
		}
		else
		{
			System.out.println("Incorrect PIN");
		}
	}
	
}
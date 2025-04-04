
					// Working of D.E.H in the Scenario of Multiple Methods


package dehUsingmultiplemethods;
import java.util.*;
public class DehUsingMultipleMethods {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Main Method Execution Started");
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Numbner : ");
		int b = sc.nextInt();
		
		multiply(a , b);
		System.out.println("Main Method Execution Ended");
	}
		static void multiply(int a , int b)
		{
			System.out.println("Multiply Method Execution Started");
			int mulRes = a * b;
			System.out.println("Multiplication Result is : " + mulRes);
			divide( a , b);
			System.out.println("Multiply Method Execution Ended");
		}
		static void divide(int a , int b )
		{
			System.out.println("Division Method Started");
			int divRes = a / b;
			System.out.println("Divison Result is : " + divRes);
			System.out.println("Division Method Execution Ended");
	}
}
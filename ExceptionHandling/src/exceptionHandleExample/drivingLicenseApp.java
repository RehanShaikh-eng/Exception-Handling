package exceptionHandleExample;
import java.util.*;
public class drivingLicenseApp {
	
	public static void main(String [] args) throws Exception
	
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		applyDrivingLicense(age);
	}
	
		
		static void applyDrivingLicense(int age) throws Exception
		{
			if (age > 18)
			{
				System.out.println("You are Ready For Driving License");
			}
			else 
			{
				drivingLicense ia = new drivingLicense();
				throw ia;
			}
		}
}

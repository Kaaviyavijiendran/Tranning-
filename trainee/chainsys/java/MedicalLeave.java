package trainee.chainsys.java;

import java.util.Scanner;

public class MedicalLeave {
	
	public static void main(String args[]) {
		
		

	Scanner attendance = new Scanner(System.in);
	System.out.println("Enter a classes held: ");
	float held = attendance.nextFloat();
	System.out.println("Enter a Number of classes attended: ");
	float attented = attendance.nextFloat();
	
	
	
	float percentage=((attented/held)
			*100);
	System.out.println("Percentage is " + percentage);
	
	
	
	if(percentage<=75)
	{
		System.out.println("You have low percentage need medical certificate");
	}
	
	else
	{
		System.out.println("Allowed to sit in exam no need medical certificate");
	}
}
}
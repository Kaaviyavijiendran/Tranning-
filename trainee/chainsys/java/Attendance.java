package trainee.chainsys.java;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
     
		Scanner attendance = new Scanner(System.in);
		System.out.println("Enter a Number of classes held: ");
		float held = attendance.nextFloat();
		System.out.println("Enter a Number of classes attended: ");
		float attented = attendance.nextFloat();
		
		float percentage=((attented/held)
				*100);
		System.out.println("Percentage is " + percentage);
		
		if(percentage<=75)
		{
			System.out.println("Not be allowed to sit in exam");
		}
		else
		{
			System.out.println("Allowed to sit in exam");
		}
		
	}
}
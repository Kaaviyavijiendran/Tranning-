package trainee.chainsys.java;

import java.util.Scanner;

public class CheckPerfectSquare {

	public static void main(String[] args) {
		
		
	int l,b;
	Scanner square = new Scanner(System.in);
	System.out.print("Enter a length: ");
	double length = square.nextDouble();
	System.out.print("Enter a breadth: ");
	double breadth = square.nextDouble();
	
	
	
	if(length==breadth)
	{
		System.out.println("Given number is Perfect Square");
	}
	else
	{
		System.out.println("Given number is not a Square");
		}
		
		
	}

}

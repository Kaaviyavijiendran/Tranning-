package trainee.chainsys.java;

import java.util.Scanner;

public class OddEvenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner number = new Scanner(System.in);
	System.out.println("Enter a num: ");
	int input = number.nextInt();

	
	for(int i=1; i<=input; i++)
	{
		
		
		if(i%2!=0)
	{
		System.out.println(i + " is odd");
	}
	
	
	    else
	{
		System.out.println(i + " is even");
	}
	   
	}

	
	
	}
}
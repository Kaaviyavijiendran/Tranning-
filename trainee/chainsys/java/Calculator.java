package trainee.chainsys.java;

import java.util.Scanner;

public class Calculator {

	public static void main (String args[]) {
		
		
		String add,sub,mul,div;
		
		Scanner cal = new Scanner(System.in);
		System.out.println("Enter a num1: ");
		System.out.println("Enter a num2: ");
		int num1 = cal.nextInt();
		int num2 = cal.nextInt();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter a operator: ");
		char operator = op.next().charAt(0);
		
		
		if(operator =='+')
		{
			System.out.println("add "+(num1+num2));
		}
		
		else if (operator =='-')
		{
			System.out.println("Sub "+(num1+num2));
		}
		
		else if (operator =='*')
		{
			System.out.println("Mul "+(num1+num2));
		}
		else if (operator =='/')
		{
			System.out.println("Div "+(num1+num2));
		}
		
		
		
		else 
		{
			System.out.println("Invalid Operator");
		}	
			
		
		
	}
}

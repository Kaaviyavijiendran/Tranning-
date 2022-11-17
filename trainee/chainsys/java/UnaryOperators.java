package trainee.chainsys.java;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = op.nextInt();
		String citizen = "Indian";
		System.out.println("Enter your Citizen");
		String citizenShip = op.next();
		
		if((age>=18)&&(citizenShip.equals("Indian"))){
			System.out.println("valid for vote");
	}
		else
		{
			System.out.println("Not Eligible for vote");
		}
		
		
	}

}

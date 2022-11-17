package trainee.chainsys.java;

import java.util.Scanner;

public class Caluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner math = new Scanner(System.in);
		System.out.println("Enter any two numbers to arithmetic operations");
		int num1 = math.nextInt();
		int num2 = math.nextInt();
		System.out.println("sum of num : " + (num1 + num2));
	}

}

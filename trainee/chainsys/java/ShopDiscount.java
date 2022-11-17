package trainee.chainsys.java;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String args[]) {
	
	
	int quantity,oneunit=100;
	Scanner discount = new Scanner(System.in);
	System.out.print("Enter a Quantity: ");
	int quantity = discount.nextInt();
	
	if(quantity>10)
	{
		System.out.println("Eligible for 10% Discount");
	}
	else
	{
		System.out.println("Not eligible for 10% Discount");
		}
		
}
}
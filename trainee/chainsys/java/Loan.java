package trainee.chainsys.java;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub
		Scanner loan = new Scanner(System.in);
		System.out.println("Enter a Principle amount: ");
		int principleamount = loan.nextInt();
		System.out.println("Enter a Interest: ");
		int interest = loan.nextInt();
		System.out.println("Enter a Time: ");
		int time = loan.nextInt();

int  totalinterest=(principleamount/interest)*time;
{
System.out.println("totalinterest"+totalinterest);
}
int totalamount=totalinterest+principleamount;
{
System.out.println("totalamonut"+totalamount);
}
int emi=totalamount/(time*12);
{
	System.out.println("emi"+emi);
}



for(int i=totalamount; i>=0; )
{
	 System.out.println("" +i);
	 i=i-emi;
 }
	}

}

package trainee.chainsys.java;

import java.util.Scanner;

public class FizzbuzzPrblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sc = new Scanner (System.in);
System.out.println("Enter a num: ");
int num = sc.nextInt();


if((num%3==0)&&(num%5==0))
{
	System.out.println("fizzbuzz");
}
else if(num%3==0)
{
	System.out.println("fizz");
}

else if(num%5==0)
{
	System.out.println("buzz");
}

else
{
	System.out.println(" " + num);
}
	}

}

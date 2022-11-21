package trainee.chainsys.java;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,i;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        
        for(i=1; i<=num; i++)
        	sum=sum+i;
        {
        System.out.println("Sum of given integer: " + sum);
	}
	}

}

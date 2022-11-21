package trainee.chainsys.java;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month: ");
        int month = sc.nextInt();
      
            switch(month)
            {
                case 1,2,3:
                {
                System.out.print("Spring Season");
                }
                break;
                case 4,5,6:
                {
                System.out.print("Summer Season");
                }
                break;
 
                case 7,8,9:
                {
                System.out.println("Mansoon Season");
                }
                break;
 
                case 10,11,12:
                {
                System.out.println("Winter season");
                }
                break;	
            }	
	}

}

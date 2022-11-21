package trainee.chainsys.java;

import java.util.Scanner;

public class NameAbbrevation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your first name: \n");
		 String firstname = sc.nextLine();
		 System.out.println("Enter your middle name: \n");
		 String middlename = sc.nextLine();
		 System.out.println("Enter your last name: \n");
		 String lastname = sc.nextLine();
		 System.out.println("Displaying your name: \n");
		 String name = sc.nextLine();

		 
		 char firstchar = firstname.charAt(0);
		 char lastchar = middlename.charAt(0);
		 System.out.println("Result:" + firstchar + lastchar + lastname);
		 
	}

	}


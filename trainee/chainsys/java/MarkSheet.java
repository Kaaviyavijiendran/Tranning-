package trainee.chainsys.java;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner marksheet = new Scanner(System.in); 
   System.out.println("Enter your Mark: ");
   int mark = marksheet.nextInt();
   
   if(mark>80)
   {
	   System.out.println("Grade is a");
   }
   
   else if(mark>=60 && mark<=80)
   {
   
	   System.out.println("Grade is B");
   } 
   
   else if(mark>=50 && mark<60) 
   {
	   System.out.println("Grade is C");
   } 
   
   else if(mark>=45 && mark<=50)
   {
	   System.out.println("Grade is A");
   } 
   
   else if(mark>=25 && mark<=45)
   {
	   System.out.println("Grade is D");
   } 
   
   
   else
   {
	   System.out.println("Grade is F");
   }
   
 
   
	}

}

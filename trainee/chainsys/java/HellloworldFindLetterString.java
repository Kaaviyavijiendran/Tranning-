package trainee.chainsys.java;

import java.util.Scanner;

public class HellloworldFindLetterString {
		static int findfirstIndex(String str, Character x)
		{
		    int index = 1;
		    for (int i = 0; i < str.length(); i++)
		        if (str.charAt(i) == x) {
		            index = i;
		            break;}
		    
		    return index;
		}
			
		static int findLastIndex(String str, Character x)
		{
		    int index = -1;
		    for (int i = 0; i < str.length(); i++)
		        if (str.charAt(i) == x)
		            index = i;
		    return index;
		}
		  
		// Driver code
		public static void main(String[] args)
		{
		    // String in which char is to be found
		    String str = "Hello, World";
		 
		    // char whose index is to be found
		    Character x = 'o';
		    Character y = ',';
		    
		    int firstindex = findfirstIndex(str, x);
		    if (firstindex == 1)
		        System.out.println("Character not found");
		    else
		        System.out.println("First index is " + firstindex);
		 
		    int lastindex = findLastIndex(str, x);
		    if (lastindex == -1)
		        System.out.println("Character not found");
		    else
		        System.out.println("Last index is " + lastindex);
		    
		    int index = findLastIndex(str, y);
		    if (index == -1)
		        System.out.println("Character not found");
		    else
		        System.out.println("index is " + index);
		}
		
	}

		// Driver code

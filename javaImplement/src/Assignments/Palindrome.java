package Assignments;

import java.util.Scanner;

public class Palindrome {
	
	public void palindromeChecker() {
		
		Scanner sc = new Scanner(System.in);
		String ch;
		boolean flag = true;
		
			while(flag) {
				System.out.print("Enter String to check palindrome or not : ");
				String palli = sc.next();
				
				StringBuffer sb = new StringBuffer(palli);
				String rev = sb.reverse().toString();
				
				if(palli.equalsIgnoreCase(rev))
					System.out.println(palli+"  Palindrome String ");
				else
					System.out.println(palli+ "  Not Palindrome String ");
					
				
				System.out.print("\nRepeat curent program [Y/N]  ---> ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();
	}
}

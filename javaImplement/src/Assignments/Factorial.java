package Assignments;

import java.util.Scanner;

public class Factorial {
		
		public void factCalc() {
		Scanner sc = new Scanner(System.in);
		String ch;
		boolean flag = true;
		
			while(flag) {
				System.out.print("Enter any number to get factorial ");
				int fact = sc.nextInt();
				int factorial = 1;
				
				if( fact < 0) {
					System.out.println("please enter positive number");
					continue;
				}
				else
					for(int i=1;i<fact;i++) {
						factorial = factorial * i ; 
				}
				
				System.out.println("Factorial of "+fact+"! is ---> "+factorial);
					
				
				System.out.println("Repeat curent program [Y/N] ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();
	
	}
}

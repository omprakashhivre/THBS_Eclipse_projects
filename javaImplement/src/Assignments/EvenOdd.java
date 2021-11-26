package Assignments;

import java.util.Scanner;

public class EvenOdd {
	public void evenOddChecker() {
		Scanner sc = new Scanner(System.in);
		String ch;
		boolean flag = true;
		
		while(flag) {
			System.out.print("enter any number to check even or odd :  ");
			int number = sc.nextInt();
			if( number % 2 == 0 ) 
				System.out.println(number+" is Even.");
			else 
				System.out.println(number+" is Odd.");
			
			System.out.print("\nRepeat curent program [Y/N]  ---> ");
			ch = sc.next();
			if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes")) {
				//flag = true;
				//evenOddChecker();
			}	
			else
				flag = false;
		}
		sc.close();
	}
}

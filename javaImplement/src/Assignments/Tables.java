package Assignments;

import java.util.Scanner;

public class Tables {
	public void table1To10() {
		Scanner sc = new Scanner(System.in);
		
		String ch;
		boolean flag = true;
		
			while(flag) {
				System.out.print("Enter number : ");
				int num1  = sc.nextInt();
				System.out.println();
				for(int i=1;i<=10;i++) {
					System.out.println(i+")\t "+ (i*num1));
				}
				
				System.out.print("\nRepeat curent program [Y/N] ---> ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();
	}
}

package Assignments;

import java.util.Scanner;

public class Armstrong {
	public void armStrong() {
		Scanner sc = new Scanner(System.in);
		
		String ch;
		boolean flag = true;
		
			while(flag) {
				System.out.print("Enter Number to check Armstrong or not : ");
				int num  = sc.nextInt();
				
				if(checkArmstrong(num))
						System.out.println(num+" is Armstrong number");
				else
						System.out.println(num+" is not an Armstrong number");
					
				
				
				System.out.print("\nRepeat curent program [Y/N] ---> ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();
	}

	private boolean checkArmstrong(int num) {
		int tmp = num,sum=0;
		while(num > 0) {
			int rev = num % 10;
			rev = rev * rev * rev;
			sum = sum + rev;
			num = num / 10;
		}
		if ( sum == tmp)
			return true;
		else
			return false;
		
	
		
	}
}

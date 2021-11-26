package Assignments;

import java.util.Scanner;

public class SwapNums {
	public void swapn() {
		Scanner sc = new Scanner(System.in);
		
		String ch;
		boolean flag = true;
		
			while(flag) {
				System.out.print("Enter two numbers saperated by space ");
				int num1  = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.print("1) swappping with temp \t 2) without temp ");
				int swapch =  sc.nextInt();
				
				switch(swapch) {
				case 1: 
					swapWithTemp(num1,num2);
					break;
				case 2:
					swapWithoutTemp(num1,num2);
					break;
				default:
					System.out.println("Enter correct choice ");
					continue;
				}
				
				
					
				
				
				System.out.print("\nRepeat curent program [Y/N]  ---> ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();
	}

	private void swapWithoutTemp(int num1,int num2) {
		System.out.println("before num1="+num1+" num2="+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num2 - num1;	
		System.out.println("after num1="+num1+" num2="+num2);
	}

	private void swapWithTemp(int num1, int num2) {
		System.out.println("before num1="+num1+" num2="+num2);
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("after num1="+num1+" num2="+num2);
		
	}
}

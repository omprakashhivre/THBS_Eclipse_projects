package Assignments;

import java.util.Scanner;

public class PrimeNumber {
	
	public void primeChecker() {
	
	Scanner sc = new Scanner(System.in);
	String ch;
	boolean flag = true,pflag=false;
	
		while(flag) {
			System.out.print("Enter number to check Prime or not ");
			int prim = sc.nextInt();			
			int prim2 = prim/2;
			for(int i=2;i < prim2 ; i++) {
				if(prim % i == 0) {
					pflag = false;
					break;
			}
			}
			if(pflag)
				System.out.println(prim +" is  a Prime number");
			else
				System.out.println(prim +" is not a Prime number");
			
				
			
				
			
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

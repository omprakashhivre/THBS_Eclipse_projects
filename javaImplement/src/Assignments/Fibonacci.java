package Assignments;

import java.util.Scanner;

public class Fibonacci {
public void fibonacciChecker() {
		
		Scanner sc = new Scanner(System.in);
		String ch;
		boolean flag = true;
		
			while(flag) {
				
				System.out.print("1: Fibonacci series \t 2: Nth Fibonacci number  ---> ");
				int num = sc.nextInt();
				
				if(num == 1) {
					System.out.print("enter number : ");
					int fibnum = sc.nextInt();
					fiboSeries(fibnum);
				}
				else {
					System.out.print("Enter number to get Nth fibonacci number ");
					int fibo = sc.nextInt();
					
					int n1=1,n2=1;
					int n3 = 0;
					
					if( fibo < 1) {
						System.out.println("enter correct fibonacci number ");
						continue;
					}
					else if(fibo == 2)
						System.out.println(fibo+"th Fibonacci number is :"+n2);
					else if(fibo == 1)
						System.out.println(fibo+"th Fibonacci number is :"+n1);
					else {
						
						for(int i=2;i<fibo;i++) {
							n3 = n1 + n2;
							n1 = n2;
							n2 = n3;
						}
						System.out.println(fibo+"th Fibonacci number is :"+n3);
						
					}
				}
				
					
				
				System.out.println("\nRepeat curent program [Y/N] ---> ");
				ch = sc.next();
				if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
					flag = true;
				else 
					flag = false;
			}
			sc.close();

	}
public void fiboSeries(int num) {
	int n1=1,n2=1,n3;
	System.out.print(n1+"\t"+n2);
	for(int i=2;i<num;i++) {
		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.print("\t"+n3);
	}
}

}

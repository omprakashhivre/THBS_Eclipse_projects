package Assignments;

import java.util.Scanner;

public class AAAsetup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String ch;
//		boolean flag = true;
		
		System.out.println("1) Even Odd \n2) Palindrome \n3) Fibonacci numer \n4) Prime number \n5) Factorial \n6) Reveres Strting \n"
				+ "7) Swapping two numbers \n8) Sorting and Searching \n9) tables \n10) Armstrong number");
//		while(flag) {
			System.out.print("Enter program's choice 1 t0 10 ---> ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 :
				EvenOdd eo = new EvenOdd();
				eo.evenOddChecker();
				break;
			case 2:
				Palindrome pd = new Palindrome();
				pd.palindromeChecker();
				break;
			case 3:
				Fibonacci fb = new Fibonacci();
				fb.fibonacciChecker();
				break;
			case 4:	
				PrimeNumber pn = new PrimeNumber();
				pn.primeChecker();
				break;
			case 5:
				Factorial ft = new Factorial();
				ft.factCalc();
				break;
			case 6:
				ReverseString rs = new ReverseString();
				rs.reverse();
				break;
			case 7:	
				SwapNums sn = new SwapNums();
				sn.swapn();
				break;
			case 8:
				SortAndSearch sas = new SortAndSearch();
				sas.sasTech();
				break;
			case 9:	
				Tables tbl = new Tables();
				tbl.table1To10();
				break;
			case 10:
				Armstrong ast = new Armstrong();
				ast.armStrong();
				break;
			default:
				System.out.println("Enter correct choice [1-10] ");
				break;
			}	
//			System.out.print("\nRepeat MAIN program [Y/N] ---> ");
//			ch = sc.next();
//			if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
//				main(args);
//			else 
//				flag = false;
	sc.close();
	}	
}

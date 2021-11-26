package Assignments;

import java.util.Scanner;

public class ReverseString {
	public void reverse() {
		
		
		Scanner sc = new Scanner(System.in);
		String ch;
		boolean flag = true;
		
		while(flag) {
			System.out.print("enter String : ");
		String str = sc.next();
		//sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("original String \t"+str+"\nReversed String \t"+sb.reverse());
		
		
		System.out.print("\nRepeat curent program [Y/N]   ---> ");
		ch = sc.next();
		if( ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"))
			flag = true;
		else 
			flag = false;
	
	}
	sc.close();
	}
}

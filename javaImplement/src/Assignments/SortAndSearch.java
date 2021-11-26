package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
	Scanner sc = new Scanner(System.in);
	public void sasTech() {
		//Scanner sc = new Scanner(System.in);
		
		String ch;
		boolean flag = true;
		int []arr = {1,2,3,45,5,4,77,88,97,4,7,13,423,60,54};
		//int []newarr;
			while(flag) {
				System.out.print("1) Enter new array \t 2) use Existing array  ---> ");
				int arrch = sc.nextInt();
				
				if(arrch == 1)
					arr = createNewArray();
				System.out.println("entered array is ");
				for(int i : arr)
					System.out.print(i +"\t");
				
				System.out.print("\n1: sorting \t 2: searching  ---> ");
				
				switch(sc.nextInt()) {
				case 1:
					System.out.print("Enter Sorting technique :\n1) Bubble sort \n2) Merge Sort \n3) Selection Sort   -----> ");
					int sortch = sc.nextInt();
					String sortedarr = sorted(arr,sortch);
					System.out.println("Sorted array :\n"+sortedarr);
					break;
				case 2:
					System.out.print("Enter number to be search in array : ");
					int number = sc.nextInt();
					int index = search(arr,number);
					
					if(index != -1)
					System.out.println(number+ " found at location " +index);
					else
						System.out.println(number+" not found in array ....");
					
					break;
				default :
					System.out.println("enter correct choice");
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

	private int search(int[] arr,int number) {
		System.out.print("Enter choice\n 1) linear search 2) binary search  ---> ");
		int ch = sc.nextInt();
		int index = -1 , size = arr.length;
		
		
		if(ch == 1) {
			for(int i=0 ; i < size ; i++) {
				 if(number == arr[i])
					 index = i;
			}
			return index;
		}
		else {
			System.out.println("for Binary searching technique make sure array must be in sorted order");
			int left = 0, right = size;
			int loc = binarySearch(arr,left,right,number);
			
			return loc;
		}
	}

	private int binarySearch(int[] arr, int left, int right, int number) {
		int mid;
		if(right >= left) {
			mid = (left+right) / 2;
			
			if(arr[mid] == number) 
				return mid;
			else if(arr[mid] < number) 
				return binarySearch(arr, mid+1, right, number);
			else if(arr[mid] > number)
				return binarySearch(arr, left, mid-1, number);			
		}
		return -1;
		
	}

	private String sorted(int[] arr,int choice) {
		Arrays.sort(arr);
		return Arrays.toString(arr);
		//return arr;
		}

	private int[] createNewArray() {		
		System.out.print("enter array size : ");
		int size = sc.nextInt();
		int newarr[] = new int[size];
		for(int i=0;i<size;i++)
			newarr[i] = sc.nextInt();
		return newarr;
	}
}
package hundred.days.of.coding;

import java.util.Scanner;

public class MissingNumberInArray {
	//Day 1: Missing number from an array
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n-1;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Input array ::" + arr);
		int num = missingNumberWithoutStreams(arr,n);
		System.out.println("Missing number :: "+ num);
	}
	
	private static int missingNumberWithoutStreams(int[]arr, int n) {
		int num=0;
		int sum =0;
		int arrsum=0;
		for(int i=1;i<=n;i++) {
			sum= sum+i;  
		}
		for(int i=0;i<n-1;i++) {
			arrsum=arr[i]+arrsum;
		}
		System.out.println("Sum :"+sum +"arrsum ::"+arrsum);
		num = sum-arrsum;
		return num;
	}

	
}

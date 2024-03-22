package hundred.days.of.coding;

import java.util.Scanner;

public class PallindromeString {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String inputString= sc.next();
		boolean isPallindrome= isPallindrome(inputString);
		System.out.println("String is pallindrome using StringBuilder API :: "+ isPallindrome);
		
		boolean isPallindromeCheck = isPallindromeUsingLoop(inputString);
		System.out.println("String is pallindrome using loop:: "+ isPallindromeCheck);
		
	}
// Using StringBuilder default method
	private static boolean isPallindrome(String inputString) {
		// TODO Auto-generated method stub
		boolean isPallindrome =false;
		if(!inputString.isEmpty()) {
			StringBuilder sb = new StringBuilder(inputString);
			System.out.println("String builder input string ::"+sb);
			StringBuilder reverseString = sb.reverse();
			System.out.println("Reverse string of input string ::"+ reverseString);
			if(inputString.contentEquals(reverseString)) {
				isPallindrome = true;
			}
			
		}else {
			System.out.println("String should not be empty");
		}
		return isPallindrome;
	}

	//Using loop and reversing a string
	
	private static boolean isPallindromeUsingLoop(String inputString) {
		boolean isPallindrome = false;
		String reverseString ="";
		if(!inputString.isEmpty()) {
			for (int i=inputString.length()-1;i>=0;i--) {
				reverseString = reverseString + inputString.charAt(i);
			}
			System.out.println("Reverse string of input string ::"+ reverseString);
			if(inputString.contentEquals(reverseString)) {
				isPallindrome=false;
			}
		}else {
			System.out.println("String should not be empty");
			isPallindrome=false;
		}
		return isPallindrome;
		
	}
	
	
	
}

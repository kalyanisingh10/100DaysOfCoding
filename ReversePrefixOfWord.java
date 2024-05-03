package hundred.days.of.coding;

import java.util.Scanner;

public class ReversePrefixOfWord {

	// Given a 0-indexed string word and a character ch, reverse the segment of word
	// that starts at index 0 and ends at the index of the first occurrence of ch
	// (inclusive). If the character ch does not exist in word, do nothing.

	// For example, if word = "abcdefd" and ch = "d", then you should reverse the
	// segment that starts at 0 and ends at 3 (inclusive). The resulting string will
	// be "dcbaefd".
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ::");
		String inputStr= sc.next();
		System.out.println("Enter the character ::");
		char ch= sc.next().charAt(0);
		int index=0;
		for(int i=0;i<inputStr.length();i++) {
			if(inputStr.charAt(i)==ch) {
				index=i;
				break;
			}
		}
		
		StringBuilder reverseStr = new StringBuilder(inputStr);
		System.out.println("index ::"+index);
	String s=	reverseStr.substring(0, index+1);
	StringBuilder str= new StringBuilder(s);
	str.reverse().append(reverseStr.substring(index+1));
			
	
		System.out.println(str);
	}
}

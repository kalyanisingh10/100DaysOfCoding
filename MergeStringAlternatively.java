package hundred.days.of.coding;

public class MergeStringAlternatively {
	// Leetcode 9 : 21/05/2024

	// You are given two strings word1 and word2. Merge the strings by adding
	// letters in alternating order, starting with word1. If a string is longer than
	// the other, append the additional letters onto the end of the merged string.
	
	/*
	 * Example 1:
	 * 
	 * Input: word1 = "abc", word2 = "pqr" Output: "apbqcr" Explanation: The merged
	 * string will be merged as so: word1: a b c word2: p q r merged: a p b q c r
	 */

	public static void main(String [] args) {
		
		String s1= "abcd";
		String s2="pq";
		String resultString = mergeStringAlternatively(s1,s2);
		System.out.println("Merged String will be ::"+resultString);		
	}

	private static String mergeStringAlternatively(String word1, String word2) {
		// TODO Auto-generated method stub
		int length =0;
		boolean isSmall= false;
        StringBuilder resultString= new StringBuilder();
		if(word1.length()<word2.length()) {
			length= word1.length();
			isSmall=true;
		}else {
			length = word2.length();
		}
		
		for(int i=0;i<length;i++) {
			
			resultString= resultString.append(word1.charAt(i));
			resultString= resultString.append(word2.charAt(i));
		}
		if(isSmall) {
			resultString.append(word2.substring(length));
		}else {
			resultString.append(word1.substring(length));
		}
		return resultString.toString();
        
    }
}

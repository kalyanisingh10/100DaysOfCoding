package hundred.days.of.coding;

public class ValidPallindrome {

	// Leetcode 7- 09/05/2024

	// A phrase is a palindrome if, after converting all uppercase letters into
	// lowercase letters and removing all non-alphanumeric characters, it reads the
	// same forward and backward. Alphanumeric characters include letters and
	// numbers.

	// Given a string s, return true if it is a palindrome, or false otherwise.
	
	public static void main(String[] args) {
		String inputString = "0P";
		boolean isValid = isValidPallindrome(inputString);
		System.out.println("String is pallindrome or not :: "+ isValid);
		}

	private static boolean isValidPallindrome(String inputString) {
		
		
		// TODO Auto-generated method stub
		String regex="[^a-zA-Z0-9]";
		if(!inputString.isEmpty()) {
			String modifiedString=inputString.toLowerCase().replaceAll(regex, "");
			
			System.out.println(modifiedString);
			StringBuilder reverseString = new StringBuilder(modifiedString).reverse();
			if(modifiedString.equalsIgnoreCase(reverseString.toString())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
		
		
		
		
	}
	}



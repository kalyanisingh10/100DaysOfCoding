package hundred.days.of.coding;

import java.util.Stack;

public class ValidParenthesis {
	
	//Leetcode 6- 08/05/2024
	//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

	//An input string is valid if:

	//Open brackets must be closed by the same type of brackets.
	//Open brackets must be closed in the correct order.
	//Every close bracket has a corresponding open bracket of the same type.
	
	public static void main(String[]args) {
		String inputString ="([}}])";
		boolean  isValid = isValid(inputString);
		System.out.println("Valid parenthesis :: "+ isValid);
	}

	
	public static boolean isValid(String s) {
	    
	if(s.length()%2!=0){
	    return false;
	}

			char[] strArr = s.toCharArray();

			Stack<Character> stack = new Stack<>();
			for (char c : strArr) {
				if(c=='('||c=='{'||c=='[') {
					stack.add(c);
					
				}else if((c==')' && !stack.isEmpty() && stack.peek()=='(')) {
						stack.pop();
					}else if((c=='}' && !stack.isEmpty() && stack.peek()=='{')) {
						stack.pop();
					}else if((c==']' && !stack.isEmpty() && stack.peek()=='[')) {
						stack.pop();
					}else{
	                    return false;
	                }
				
			}
			
			
	        return stack.isEmpty();
	    }
}

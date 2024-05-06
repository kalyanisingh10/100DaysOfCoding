package hundred.days.of.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
	
	//Leetcode 4- 06/05/2024
	//Given a string s consisting of words and spaces, return the length of the last word in the string.

	//A word is a maximal substring consisting of non-space characters only.
public static void main(String[] args) {
	String str="Hello World";
    List<String> strList=   Arrays.asList(str.split(" "));
    System.out.println("Size of the list ::"+  strList.size());
    
    int size = strList.get(strList.size()-1).length();
    System.out.println(size);
	
}
}

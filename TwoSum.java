package hundred.days.of.coding;

public class TwoSum {
	//Leetcode 8 -10/05/2024
	
	//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	//You may assume that each input would have exactly one solution, and you may not use the same element twice.

	//You can return the answer in any order.
	
	public static void main(String [] args) {
		int[] twoSum = new int[2];
		int[] inputArr = {3,2,3};
		int target = 6;
		int sum=0;
		twoSum = twoSumMethod(inputArr,target);
		  
		System.out.println("Two sum ::" + twoSum[0]+ " "+twoSum[1]);
	}

	private static int[] twoSumMethod(int[] inputArr, int target) {
		for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] + inputArr[j] == target){
                	return new int[]{i,j};
                }
            }
        }
		return null;
	
	
	}
	
	
}


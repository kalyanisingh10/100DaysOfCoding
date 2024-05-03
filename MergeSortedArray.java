package hundred.days.of.coding;

import java.util.Arrays;


public class MergeSortedArray {

	// You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	// order, and two integers m and n, representing the number of elements in nums1
	// and nums2 respectively.

	// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

	// The final sorted array should not be returned by the function, but instead be
	// stored inside the array nums1. To accommodate this, nums1 has a length of m +
	// n, where the first m elements denote the elements that should be merged, and
	// the last n elements are set to 0 and should be ignored. nums2 has a length of
	// n.
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0};
		int [] arr2= {2,5,6};
		int num1= 3;
		int num2 =3;
		
		
		int arr1Length = arr1.length;
        if(arr1Length>num2&& arr1Length==num1+num2){
            for(int i=0;i<arr2.length;i++){
            	arr1[num1+i]=arr2[i];
            }
        }
         Arrays.sort(arr1);
         for(int i=0;i<arr1.length;i++) {
        	 System.out.println(arr1[i]);
         }
		
		
	}
}



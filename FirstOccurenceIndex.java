package hundred.days.of.coding;

public class FirstOccurenceIndex {

	// Leetcode 5 - 7/05/2024
	// Given two strings needle and haystack, return the index of the first
	// occurrence of needle in haystack, or -1 if needle is not part of haystack.

	public static void main(String[] args) {

		String haystack = "sadbutsad";
		String needle = "sad";
		int index = 0;
		if (haystack.contains(needle)) {
			index = haystack.indexOf(needle);

		} else {
			index = -1;
		}
		System.out.println("Index of needle :: "+index);
	}

}

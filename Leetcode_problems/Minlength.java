package Leetcode_problems;
//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/
public class Minlength {

	class Solution {
	    public int minLength(String s) {
	        char[] arr = new char[s.length()];
	        int i = -1;
	        for (char ch : s.toCharArray()) {
	            if (i >= 0 && ((ch == 'B' && arr[i] == 'A') || (ch == 'D' && arr[i] == 'C'))) {
	                i--;
	            } else {
	                arr[++i] = ch;
	            }
	        }
	        return i + 1;
	    }
	}

	/*Inside the loop, the code checks if the current index i is valid (i >= 0) and if the current character ch forms a removable pair with the last character in arr.
	If ch is 'B' and the last character in arr is 'A', or if ch is 'D' and the last character in arr is 'C', it means a pair is found. So, it decrements i to remove the last character from arr.
	If no pair is found, it means ch is added to arr, and i is incremented to reflect this addition.*/
}

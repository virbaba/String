/*
  check removing one character can a string palindrome or not
   TEST CASE:  AZBCDDCBA
*/
import java.util.* ;
import java.io.*; 

public class Solution {
 
	public static boolean validPalindrome(int n, String s) {
		// Write your code here
		char[] arr = s.toCharArray();

		int count = 0;
		int i = 0, j = n - 1;
		while(i < j){
			if(arr[i] == arr[j]){
				i++;j--;
			}
			else if(arr[i] != arr[j]){
				count++;
				if(count > 1)
					return false;
				if(arr[i+1] == arr[j])
				{
					i++;
				}
				else if(arr[i] == arr[j-1]){
					j--;
				}
			}
		}
		return true;
	}

}

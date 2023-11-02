/*
  TIME COMPLEXITY: O(N)
  SAPCE COMPLEXTIY: O(N)

  using map to store frequency
*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static Character mostFrequentChar(String str) {
        // Write your code here..
        HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(map.get(c) == null)
				map.put(c, 1);
			else
				map.put(c,map.get(c) + 1);	
		}

		char ans = '\u0000';
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(map.get(c) > max){
				ans = c;
				max = map.get(c);
			}
			else if(map.get(c) == max){
				if(ans > c)
					ans = c;
			}
		}

		return new Character(ans);
    }

}

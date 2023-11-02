import java.util.*;
public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
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
		}

		return ans;
	}

}

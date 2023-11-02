/*
  imput: aaabbccdsa
  output: a3b2c2dsa
*/
public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here
		StringBuffer ans = new StringBuffer();

		for(int i = 0; i < str.length();){
			int count = 1;
			ans.append(str.charAt(i));
			int j = i + 1;
			while(j < str.length() && str.charAt(i) == str.charAt(j)){
				count++;
				j++;
			}
			if(count > 1){
				ans.append(""+count);
			}
			i = j;
		}

		return ans.toString();
	}

}

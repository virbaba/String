
public class Solution {
	public static String removeConsecutiveDuplicates(String str) {

		// Write your code here
		StringBuffer ans = new StringBuffer();
        for(int i = 0; i < str.length();){
           ans.append(str.charAt(i));
		   int j = i + 1;
		   
		   while(j < str.length() && str.charAt(i) == str.charAt(j)){
			   j++;
		   }
		   i = j;
        }

        return ans.toString();
	}

}

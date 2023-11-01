public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		int i = str.length() - 1;
		int j = i;

		StringBuffer ans = new StringBuffer();

		while(i >= 0){
			while(i >= 0 && str.charAt(i) != ' '){
				i--;
			}
			ans.append(str.substring(i+1, j+1)+' ');
			i = i- 1;
			j = i;
		}
		

		return ans.toString().trim();
		
	}
}

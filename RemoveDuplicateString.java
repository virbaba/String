/*
  Input : abcadeecfb
  Output: abcdef
*/
public class Solution 
{
    public static String removeDuplicates(String str) 
    {
        //Your code goes here
        StringBuffer ans = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(ans.indexOf(""+str.charAt(i)) == -1){
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }
}
